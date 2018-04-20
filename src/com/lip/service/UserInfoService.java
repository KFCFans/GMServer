package com.lip.service;

import com.lip.pojo.Userinfo;
import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.UserInfoResult;

import java.util.List;

public interface UserInfoService {

    public UserInfoResult getUserInfo(String uid);

    public RequestResult changeUserInfo(Userinfo userinfo);

    // 获取员工列表（用于网页显示）
    public List<Userinfo> getMemberList();
}
