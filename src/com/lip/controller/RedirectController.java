package com.lip.controller;

import com.lip.pojo.Feedback;
import com.lip.pojo.Taskinfo;
import com.lip.pojo.Userinfo;
import com.lip.pojo.jspbean.MyUserInfo;
import com.lip.pojo.result.FeedbackListResult;
import com.lip.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/redirect")
public class RedirectController {

    @Autowired
    public FeedBackService feedBackService;
    @Autowired
    public UserSecurityServie userSecurityServie;
    @Autowired
    public UserInfoService userInfoService;
    @Autowired
    public TaskService taskService;
    @Autowired
    public AreaService areaService;
    @Autowired
    public PlantService plantService;
    @Autowired
    public ActivityService activityService;

    @RequestMapping("/login")
    public ModelAndView loginbyJSP(String username,String password){
        ModelAndView mv=new ModelAndView();
        // 登陆成功跳转main.jsp，失败则跳转login.jsp
        mv.setViewName(userSecurityServie.bgLogin(username,password));
        FeedbackListResult result=feedBackService.getFeedBack();
        mv.addObject("fblist",result.getData());
        mv.addObject("mblist",userInfoService.getMemberList());
        mv.addObject("tklist",taskService.getTaskListForJSP());
        return mv;
    }

    @RequestMapping("/user")
    public ModelAndView gotoUser(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("user");
        List<Userinfo> list=userInfoService.getMemberList();
        List<MyUserInfo> res=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            MyUserInfo myUserInfo=new MyUserInfo();
            myUserInfo.setAchievement(list.get(i).getAchievement());
            myUserInfo.setNickname(list.get(i).getNickname());
            myUserInfo.setUid(list.get(i).getUid());
            myUserInfo.setGender(list.get(i).getGender()==0?"男":"女");
            res.add(myUserInfo);
        }
        mv.addObject("mblist",res);
        return mv;
    }

    @RequestMapping("/task")
    public ModelAndView gotoTask(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("task");
        mv.addObject("tklist",taskService.getTaskListForJSP());
        return mv;
    }

    @RequestMapping("/addtask")
    public ModelAndView gotoAddTask(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("addtask");
        mv.addObject("arealist",areaService.getAreaList().getData());
        mv.addObject("plantlist",plantService.getPlantList().getData());
        mv.addObject("uidlist",userInfoService.getMemberList());
        return mv;
    }

    @RequestMapping("/response")
    public ModelAndView gotoResponse(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("response");
        mv.addObject("fblist",feedBackService.getFeedBack().getData());
        return mv;
    }

    @RequestMapping("/readresponse")
    public ModelAndView gtotReadResponse(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("readresponse");
        mv.addObject("fblist",feedBackService.getReadFeedBack().getData());
        return mv;
    }


    @RequestMapping("/manageactivity")
    public ModelAndView gotoManageActivity(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("manageactivity");
        return mv;
    }

    @RequestMapping("/addactivity")
    public ModelAndView gotoAddActivity(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("addactivity");
        return mv;
    }

    @RequestMapping("/main")
    public ModelAndView gotoMain(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("main");
        FeedbackListResult result=feedBackService.getFeedBack();
        mv.addObject("fblist",result.getData());
        mv.addObject("mblist",userInfoService.getMemberList());
        mv.addObject("tklist",taskService.getTaskListForJSP());
        return mv;
    }

    @RequestMapping("/offline")
    public String gotoLogin(){
        return "login";
    }

    // 添加新员工
    @RequestMapping("/addworker")
    public ModelAndView addNewWorker(Userinfo userinfo){
        ModelAndView mv=new ModelAndView();
        userinfo.setPriority(1);
        userSecurityServie.userRegister(userinfo);
        mv.setViewName("redirect:user");
        return mv;
    }

    // 删除员工
    @RequestMapping("/delworker")
    public ModelAndView delWorker(String uid){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("redirect:user");
        userSecurityServie.delWorker(uid);
        return mv;
    }

    // 删除任务
    @RequestMapping("/deltask")
    public ModelAndView delTask(int tid){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("redirect:task");
        taskService.delTask(tid);
        return mv;
    }

    // 添加任务
    @RequestMapping("/newtask")
    public ModelAndView newTask(Taskinfo taskinfo,int lasttime){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("redirect:addtask");
        taskService.newTask(taskinfo,lasttime);
        return mv;
    }

    // 已读反馈信息
    @RequestMapping("/readfeedback")
    public ModelAndView readFeedback(int fid){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("redirect:response");
        feedBackService.readFeedBack(fid);
        return mv;
    }

    // 发布活动
    @RequestMapping("/newactivity")
    public ModelAndView newActivity(String avname, String avplace, String avstime, String avetime, String avdetail, String avpic){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("redirect:addactivity");
        activityService.releaseActivity(avname, avplace, avstime, avetime, avdetail, avpic);
        return mv;
    }
}
