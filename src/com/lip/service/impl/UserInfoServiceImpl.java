package com.lip.service.impl;

import com.lip.mapper.UserinfoMapper;
import com.lip.pojo.Userinfo;
import com.lip.pojo.UserinfoExample;
import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.UserInfoResult;
import com.lip.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    public UserinfoMapper userinfoMapper;

    @Override
    public UserInfoResult getUserInfo(String uid) {
        Userinfo userinfo=null;
        try {
            userinfo=userinfoMapper.selectByPrimaryKey(uid);
        }catch (Exception e){
            return new UserInfoResult(500,"failed",null);
        }
        return new UserInfoResult(200,"OK",userinfo);
    }

    @Override
    public RequestResult changeUserInfo(Userinfo userinfo) {
        try {
            userinfoMapper.updateByPrimaryKeySelective(userinfo);
        }catch (Exception e){
            return new RequestResult(500,"failed",e.getMessage());
        }
        return new RequestResult(200,"OK","修改成功");
    }

    // 权限，0为管理员，1为员工，2为学生
    @Override
    public List<Userinfo> getMemberList() {
        List<Userinfo> list=null;
        UserinfoExample example=new UserinfoExample();
        UserinfoExample.Criteria criteria=example.createCriteria();
        criteria.andPriorityEqualTo(1);
        try {
            list=userinfoMapper.selectByExample(example);
        }catch (Exception e){
            return null;
        }
        return list;
    }
}
