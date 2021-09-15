package com.bhup.onetoone1.entity;

import javax.persistence.*;

@Entity
@Table
public class ParentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    private String fatherName;
    private String mobNumber;
    private String address;

    public ParentDetail() {
    }

    public ParentDetail(int rollNo, String fatherName, String mobNumber, String address) {
        this.rollNo = rollNo;
        this.fatherName = fatherName;
        this.mobNumber = mobNumber;
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
