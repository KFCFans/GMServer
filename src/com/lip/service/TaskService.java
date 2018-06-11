package com.lip.service;

import com.lip.pojo.jspbean.MyTaskInfo;
import com.lip.pojo.Taskinfo;
import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.TaskListResult;

import java.util.List;

public interface TaskService {

    // 获取用户未完成任务
    public TaskListResult getTaskList(String uid);

    // 获取用户历史任务
    public TaskListResult getHistoryTaskList(String uid);

    // 新建任务
    public RequestResult newTask(Taskinfo taskinfo,int lasttime);

    // 完成增的任务
    public RequestResult addTaskFinished(String uid,int pid,int aid,String ipic,int tid);

    // 完成删的任务
    public RequestResult delTaskFinished(String uid,int iid,int tid);

    // 完成维护的任务
    public RequestResult saveTaskFinished(String uid,int iid,int tid);

    // 完成移植的任务
    public RequestResult replaceTaskFinished(String uid,int iid,int aid,int tid);

    // 获取任务列表(JSP)
    public List<MyTaskInfo> getTaskListForJSP();

    // 删除任务(JSP)
    public RequestResult delTask(int tid);

    // 接受任务
    public RequestResult acceptTask(int tid);

    // 查询已完成任务
    public List<MyTaskInfo> getFinishedTaskByUid(String uid);

    // 查询未完成任务
    public List<MyTaskInfo> getUnFinishedTaskByUid(String uid);
}
