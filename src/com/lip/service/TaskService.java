package com.lip.service;

import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.TaskListResult;

public interface TaskService {

    // 获取用户未完成任务
    public TaskListResult getTaskList(String uid);

    public RequestResult finishTask(int tid,String uid);

    public RequestResult delayTask(int tid,int days);

    public RequestResult undoTask(int tid,String uid);
}
