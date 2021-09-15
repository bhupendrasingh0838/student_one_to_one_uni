package com.bhup.onetoone1.entity;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    private String name;
    private String branch;
    private String year;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parentDetail")
    private ParentDetail parentDetail;

    public Student() {
    }

    public Student(int rollNo, String name, String branch, String year, ParentDetail parentDetail) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.year = year;
        this.parentDetail = parentDetail;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ParentDetail getParentDetail() {
        return parentDetail;
    }

    public void setParentDetail(ParentDetail parentDetail) {
        this.parentDetail = parentDetail;
    }
}
