package com.lip.pojo.result;

import com.lip.pojo.Plantinfo;

import java.util.List;

public class PlantListResult {

    private Integer stauts;

    private String msg;

    private List<Plantinfo> data;

    public PlantListResult(Integer stauts, String msg, List<Plantinfo> data) {
        this.stauts = stauts;
        this.msg = msg;
        this.data = data;
    }

    public Integer getStauts() {
        return stauts;
    }

    public void setStauts(Integer stauts) {
        this.stauts = stauts;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Plantinfo> getData() {
        return data;
    }

    public void setData(List<Plantinfo> data) {
        this.data = data;
    }
}
