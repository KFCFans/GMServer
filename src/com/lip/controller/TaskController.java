package com.lip.controller;

import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.TaskListResult;
import com.lip.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/task")
public class TaskController {

    @Autowired
    public TaskService taskService;

    @ResponseBody
    @RequestMapping("/list")
    public TaskListResult getTaskList(String uid){
        return taskService.getTaskList(uid);
    }

    @ResponseBody
    @RequestMapping("/finish")
    public RequestResult finishTask(String uid,int tid){
        return taskService.finishTask(tid,uid);
    }

}
