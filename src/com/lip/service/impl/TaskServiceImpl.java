package com.lip.service.impl;

import com.lip.mapper.PlantindividualMapper;
import com.lip.mapper.TaskinfoMapper;
import com.lip.pojo.*;
import com.lip.pojo.jspbean.MyTaskInfo;
import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.TaskListResult;
import com.lip.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    public TaskinfoMapper taskinfoMapper;

    @Autowired
    public PlantindividualMapper plantindividualMapper;

    @Override
    public TaskListResult getTaskList(String uid) {
        TaskinfoExample example=new TaskinfoExample();
        TaskinfoExample.Criteria criteria=example.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andTstatusLessThan(2);
        List<Taskinfo> data=null;
        try {
            data=taskinfoMapper.selectByExample(example);
        }catch (Exception e){
            return new TaskListResult(500,"failed",null);
        }
        return new TaskListResult(200,"OK",data);
    }

    @Override
    public RequestResult newTask(Taskinfo taskinfo) {
        try {
            taskinfoMapper.insertSelective(taskinfo);
        }catch (Exception e){
            return new RequestResult(500,"failed",e.getMessage());
        }
        return new RequestResult(200,"OK","下达任务成功！");
    }

    @Override
    public RequestResult addTaskFinished(String uid, int pid, int aid, String ipic,int tid) {
        Plantindividual plantindividual=new Plantindividual();
        plantindividual.setAid(aid);
        plantindividual.setIstatus(0);
        plantindividual.setIpic(ipic);
        plantindividual.setPid(pid);
        try {
            plantindividualMapper.insertSelective(plantindividual);
            finishedTask(tid);

        }catch (Exception E){
            return new RequestResult(500,"failed",E.getMessage());
        }
        return new RequestResult(200,"OK","新增成功！");
    }

    @Override
    public RequestResult delTaskFinished(String uid, int iid,int tid) {
        try {
            plantindividualMapper.deleteByPrimaryKey(iid);
            finishedTask(tid);
        }catch (Exception e){
            return new RequestResult(500,"failed",e.getMessage());
        }
        return new RequestResult(200,"OK","删除成功!");
    }

    @Override
    public RequestResult saveTaskFinished(String uid, int iid,int tid) {
        Plantindividual plantindividual=new Plantindividual();
        plantindividual.setIid(iid);
        plantindividual.setIstatus(0);
        try {
            plantindividualMapper.updateByPrimaryKeySelective(plantindividual);
            finishedTask(tid);
        }catch (Exception e){
            return new RequestResult(500,"failed",e.getMessage());
        }
        return new RequestResult(200,"OK","维护成功！");
    }

    @Override
    public RequestResult replaceTaskFinished(String uid, int iid, int aid,int tid) {
        Plantindividual plantindividual=new Plantindividual();
        plantindividual.setIstatus(0);
        plantindividual.setIid(iid);
        plantindividual.setAid(aid);
        try {
            plantindividualMapper.updateByPrimaryKeySelective(plantindividual);
            finishedTask(tid);
        }catch (Exception e){
            return new RequestResult(500,"failed",e.getMessage());
        }
        return new RequestResult(200,"OK","移植成功!");
    }

    @Override
    public List<MyTaskInfo> getTaskListForJSP() {
        List<Taskinfo> list;
        List<MyTaskInfo> res=new ArrayList<>();
        TaskinfoExample example=new TaskinfoExample();

        String area[]={"牡丹园","桂花园","西瓜园","樱花园","桔子园","小花园","大花园"};
        String status[]={"未完成","延期","已完成"};
        try {
            list=taskinfoMapper.selectByExample(example);
        }catch (Exception e){
            return null;
        }
        for(int i=0;i<list.size();i++){
            MyTaskInfo taskInfo=new MyTaskInfo();
            taskInfo.setUid(list.get(i).getUid());
            taskInfo.setTname(list.get(i).getTname());
            // 地区
            taskInfo.setArea(area[list.get(i).getAid()-1]);
            // 状态
            taskInfo.setStatus(status[list.get(i).getTstatus()]);
            res.add(taskInfo);
        }
        return res;
    }

    private void finishedTask(int tid) throws Exception{
        Taskinfo taskinfo=new Taskinfo();
        taskinfo.setTid(tid);
        taskinfo.setTstatus(2);
        taskinfoMapper.updateByPrimaryKeySelective(taskinfo);
    }

    //FIXME: 如果需要成就系统，在finished Task中加入成就增长实现方法即可


}
