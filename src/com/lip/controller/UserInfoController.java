package com.lip.controller;

import com.lip.pojo.Userinfo;
import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.UserInfoResult;
import com.lip.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    public UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping("/get")
    public UserInfoResult getUserInfo(String uid){
        return userInfoService.getUserInfo(uid);
    }

    @ResponseBody
    @RequestMapping("/change")
    public RequestResult changeUserInfo(Userinfo userinfo){
        return userInfoService.changeUserInfo(userinfo);
    }
}
