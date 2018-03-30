package com.lip.service.impl;

import com.lip.mapper.UserinfoMapper;
import com.lip.pojo.Userinfo;
import com.lip.pojo.UserinfoExample;
import com.lip.pojo.result.RequestResult;
import com.lip.service.UserSecurityServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserSecurityServiceImpl implements UserSecurityServie{

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public RequestResult userRegister(Userinfo userinfo) {
        String token = UUID.randomUUID().toString();
        userinfo.setAccesstoken(token);
        userinfo.setPriority(0);
        userinfo.setAchievement(0);
        try {
            userinfoMapper.insert(userinfo);
        }catch (Exception e){
            return new RequestResult(500,"failed","用户已注册！");
        }
        return new RequestResult(200,"OK",token);
    }

    @Override
    public RequestResult userLogin(String uid, String pwd) {
        Userinfo userinfo=null;
        try {
            userinfo = userinfoMapper.selectByPrimaryKey(uid);
        }catch (Exception e) {
            return new RequestResult(500,"failed",e.getMessage());
        }
        if(userinfo.getPassword()==pwd){
            return new RequestResult(200,"OK",userinfo.getAccesstoken());
        }else{
            return new RequestResult(400,"failed","密码错误！");
        }
    }

    @Override
    public RequestResult changePassword(String uid, String oldpwd, String newpwd) {
        String token=UUID.randomUUID().toString();
        Userinfo userinfo=null;
        try{
            userinfo=userinfoMapper.selectByPrimaryKey(uid);
        }catch (Exception e) {
            return new RequestResult(500,"failed",e.getMessage()) ;
        }
        if(userinfo.getPassword()!=oldpwd) return new RequestResult(400,"failed","密码错误！");
        userinfo.setPassword(newpwd);
        userinfo.setAccesstoken(token);
        try {
            userinfoMapper.updateByPrimaryKeySelective(userinfo);
        }catch (Exception e){
            return new RequestResult(500,"failed",e.getMessage());
        }
        return new RequestResult(200,"OK",token);
    }

    @Override
    public boolean checkAccessToken(String accesstoken) {
        UserinfoExample example=new UserinfoExample();
        UserinfoExample.Criteria criteria=example.createCriteria();
        criteria.andAccesstokenEqualTo(accesstoken);
        List<Userinfo> list=null;
        try {
            list = userinfoMapper.selectByExample(example);
        }catch (Exception e){
            return false;
        }
        if(list==null||list.size()==0) return false;
        else return true;
    }
}
