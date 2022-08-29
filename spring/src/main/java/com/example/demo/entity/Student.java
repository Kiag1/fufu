package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("student")
public class Student {
    private String name; //姓名
    private String department; //学院
    private String sno; //学号
    private int stime;  //时长
    private String tt;  //日期

    public Student() {
    }

    public Student(String name, String dapartment, String sno, int stime, String tt) {
        this.name = name;
        this.department = dapartment;
        this.sno = sno;
        this.stime = stime;
        this.tt = tt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepart() {
        return department;
    }

    public void setDepart(String depart) {
        this.department = depart;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public int getStime() {
        return stime;
    }

    public void setStime(int stime) {
        this.stime = stime;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }
}
