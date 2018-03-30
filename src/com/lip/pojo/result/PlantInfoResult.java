package com.lip.pojo.result;

import com.lip.pojo.Plantinfo;

public class PlantInfoResult {

    private Integer status;

    private String msg;

    private Plantinfo data;

    public PlantInfoResult(Integer status, String msg, Plantinfo data) {
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

    public Plantinfo getData() {
        return data;
    }

    public void setData(Plantinfo data) {
        this.data = data;
    }
}
