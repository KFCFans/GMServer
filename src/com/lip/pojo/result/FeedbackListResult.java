package com.lip.pojo.result;

import com.lip.pojo.Feedback;

import java.util.List;

public class FeedbackListResult {

    private Integer status;

    private String msg;

    private List<Feedback> data;

    public FeedbackListResult(Integer status, String msg, List<Feedback> data) {
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

    public List<Feedback> getData() {
        return data;
    }

    public void setData(List<Feedback> data) {
        this.data = data;
    }
}
