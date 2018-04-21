package com.lip.pojo.result;

import com.lip.pojo.Viewpager;

import java.util.List;

public class ViewpagerListResult {

    private Integer status;

    private String msg;

    private List<Viewpager> data;

    public ViewpagerListResult(Integer status, String msg, List<Viewpager> data) {
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

    public List<Viewpager> getData() {
        return data;
    }

    public void setData(List<Viewpager> data) {
        this.data = data;
    }
}
