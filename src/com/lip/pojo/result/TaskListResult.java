package com.lip.pojo.result;

import com.lip.pojo.Taskinfo;

import java.util.List;

public class TaskListResult {

    private Integer status;

    private String msg;

    private List<Taskinfo> data;

    public TaskListResult(Integer status, String msg, List<Taskinfo> data) {
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

    public List<Taskinfo> getData() {
        return data;
    }

    public void setData(List<Taskinfo> data) {
        this.data = data;
    }
}
