package com.java.code.model;

import java.util.Date;


public class Student {
    private long id;
    private String name;
    private Date createTime;
    private Date updateTime;
    private String mima;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setmima(String mima) {
        this.mima = mima;
    }

    public String getmima() {
        return mima;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
