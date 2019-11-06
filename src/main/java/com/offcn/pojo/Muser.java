package com.offcn.pojo;

import javax.transaction.Synchronization;
import java.io.Serializable;

public class Muser implements Serializable {
    private Integer uid;
    private String uname;
    private Integer pwd;

    @Override
    public String toString() {
        return "Muser{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd=" + pwd +
                '}';
    }

    public Muser() {
    }

    public Muser(Integer uid, String uname, Integer pwd) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getPwd() {
        return pwd;
    }

    public void setPwd(Integer pwd) {
        this.pwd = pwd;
    }
}
