package com.lip.pojo;

public class Plantinfo {
    private Integer pid;

    private String pname;

    private String pimg;

    private String psname;

    private String pdetail;

    private String ptype;

    private String plhxg;

    private String pxyfb;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg == null ? null : pimg.trim();
    }

    public String getPsname() {
        return psname;
    }

    public void setPsname(String psname) {
        this.psname = psname == null ? null : psname.trim();
    }

    public String getPdetail() {
        return pdetail;
    }

    public void setPdetail(String pdetail) {
        this.pdetail = pdetail == null ? null : pdetail.trim();
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }

    public String getPlhxg() {
        return plhxg;
    }

    public void setPlhxg(String plhxg) {
        this.plhxg = plhxg == null ? null : plhxg.trim();
    }

    public String getPxyfb() {
        return pxyfb;
    }

    public void setPxyfb(String pxyfb) {
        this.pxyfb = pxyfb == null ? null : pxyfb.trim();
    }
}