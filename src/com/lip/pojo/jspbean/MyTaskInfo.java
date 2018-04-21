package com.lip.pojo.jspbean;

public class MyTaskInfo {

    // 地区
    private String area;

    // 任务名称
    private String tname;

    // 负责人手机号
    private String uid;

    // 任务状态 0未完成 1延期  2完成
    private String status;

    // 任务类型 0维护 1移植 2新增 3删除
    private String type;

    // 任务开始时间 yy-mm-dd格式
    private String stime;

    // 任务id
    private Integer tid;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}
