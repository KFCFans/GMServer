package com.lip.controller;

import com.lip.pojo.Feedback;
import com.lip.pojo.result.FeedbackListResult;
import com.lip.service.FeedBackService;
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
        mv.addObject("list",result.getData());
        System.out.println("反馈数量："+result.getData().size());
        return mv;
    }

    @RequestMapping("/offline")
    public String gotoLogin(){
        return "login";
    }
}
