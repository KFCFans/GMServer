package com.lip.service;

import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.TaskListResult;

public interface TaskService {

    public TaskListResult getTaskList();

    public RequestResult finishTask(int tid,String uid);

    public RequestResult delayTask(int tid,int days);

    public RequestResult undoTask(int tid,String uid);
}
