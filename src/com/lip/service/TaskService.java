package com.lip.service;

import com.lip.pojo.Taskinfo;
import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.TaskListResult;

public interface TaskService {

    // 获取用户未完成任务
    public TaskListResult getTaskList(String uid);

    // 新建任务
    public RequestResult newTask(Taskinfo taskinfo);

    // 完成增的任务
    public RequestResult addTaskFinished(String uid,int pid,int aid,String ipic,int tid);

    // 完成删的任务
    public RequestResult delTaskFinished(String uid,int iid,int tid);

    // 完成维护的任务
    public RequestResult saveTaskFinished(String uid,int iid,int tid);

    // 完成移植的任务
    public RequestResult replaceTaskFinished(String uid,int iid,int aid,int tid);
}
