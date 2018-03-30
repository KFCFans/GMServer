package com.lip.service;

import com.lip.pojo.Userinfo;
import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.UserInfoResult;

public interface UserInfoService {

    public UserInfoResult getUserInfo(String uid);

    public RequestResult changeUserInfo(Userinfo userinfo);
}
