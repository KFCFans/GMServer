package com.lip.controller;

import com.lip.pojo.Taskinfo;
import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.TaskListResult;
import com.lip.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

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
    @ResourceMapping("/new")
    public RequestResult newTask(Taskinfo taskinfo,int lasttime){
        return taskService.newTask(taskinfo,lasttime);
    }

    @ResponseBody
    @RequestMapping("/add")
    public RequestResult addTaskFinished(String uid,int aid,int tid,int pid,String ipic){
        return taskService.addTaskFinished(uid,pid,aid,ipic,tid);
    }

    @ResponseBody
    @RequestMapping("/del")
    public RequestResult delTaskFinished(String uid,int tid,int iid){
        return taskService.delTaskFinished(uid,iid,tid);
    }

    @ResponseBody
    @RequestMapping("/replace")
    public RequestResult replaceTaskFinished(String uid,int iid,int aid,int tid){
        return taskService.replaceTaskFinished(uid,iid,aid,tid);
    }

    @ResponseBody
    @RequestMapping("/maintain")
    public RequestResult maintainTaskFinished(String uid,int iid,int tid){
        return taskService.saveTaskFinished(uid, iid, tid);
    }

    @ResponseBody
    @RequestMapping("/accept")
    public RequestResult acceptTask(int tid){
        return taskService.acceptTask(tid);
    }

}
