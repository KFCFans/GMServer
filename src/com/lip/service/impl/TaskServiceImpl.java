package com.lip.service.impl;

import com.lip.mapper.TaskinfoMapper;
import com.lip.pojo.Taskinfo;
import com.lip.pojo.TaskinfoExample;
import com.lip.pojo.Userinfo;
import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.TaskListResult;
import com.lip.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    public TaskinfoMapper taskinfoMapper;

    @Override
    public TaskListResult getTaskList() {
        TaskinfoExample example=new TaskinfoExample();
        List<Taskinfo> data=null;
        try {
            data=taskinfoMapper.selectByExample(example);
        }catch (Exception e){
            return new TaskListResult(500,"failed",null);
        }
        return new TaskListResult(200,"OK",data);
    }

    /**
     * 任务状态，0未完成，1延期，2完成
     */
    @Override
    public RequestResult finishTask(int tid, String uid) {
        Taskinfo taskinfo=new Taskinfo();
        taskinfo.setTid(tid);
        taskinfo.setTstatus(2);


        return null;
    }

    @Override
    public RequestResult delayTask(int tid, int days) {
        return null;
    }

    @Override
    public RequestResult undoTask(int tid, String uid) {
        return null;
    }


}
