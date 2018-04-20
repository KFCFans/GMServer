package com.lip.controller;

import com.lip.pojo.Feedback;
import com.lip.pojo.result.FeedbackListResult;
import com.lip.service.FeedBackService;
import com.lip.service.TaskService;
import com.lip.service.UserInfoService;
import com.lip.service.UserSecurityServie;
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
    public String gotoUser(){
        return "user";
    }

    @RequestMapping("/task")
    public String gotoTask(){
        return "task";
    }

    @RequestMapping("/response")
    public String gotoResponse(){
        return "response";
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
}
