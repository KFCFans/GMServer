package com.lip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/redirect")
public class RedirectController {

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
    public String gotoMain(){
        return "main";
    }
}
