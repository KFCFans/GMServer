package com.lip.pojo.result;

import com.lip.pojo.Activityinfo;

import java.util.List;

public class ActivityListResult {

    private Integer status;

    private String msg;

    private List<Activityinfo> data;

    public ActivityListResult(Integer status, String msg, List<Activityinfo> data) {
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

    public List<Activityinfo> getData() {
        return data;
    }

    public void setData(List<Activityinfo> data) {
        this.data = data;
    }
}
