package com.lip.pojo.result;

import com.lip.pojo.Areainfo;

import java.util.List;

public class AreaListResult {

    private Integer status;

    private String msg;

    private List<Areainfo> data;

    public AreaListResult(Integer status, String msg, List<Areainfo> data) {
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

    public List<Areainfo> getData() {
        return data;
    }

    public void setData(List<Areainfo> data) {
        this.data = data;
    }
}
