package com.lip.pojo.result;

import com.lip.pojo.Userinfo;

public class UserInfoResult {

    private Integer status;

    private String msg;

    private Userinfo data;

    public UserInfoResult(Integer status, String msg, Userinfo data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Userinfo getData() {
        return data;
    }

    public void setData(Userinfo data) {
        this.data = data;
    }
}
