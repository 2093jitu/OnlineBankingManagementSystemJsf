/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author User
 */
@Entity
@Table(name = "new_account")
public class CreateAccount implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "acc")
    private int acc;

    @Column(name = "name")
    private String name;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "pin")
    private String pin;

    @Column(name = "acc_type")
    private String acc_type;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "caste")
    private String caste;

    @Column(name = "micr_no")
    private int micr_no;

    @Column(name = "gender")
    private String gender;

    @Column(name = "mob")
    private String mob;

    @Column(name = "address")
    private String address;

    @Column(name = "sec_q")
    private String sec_q;

    @Column(name = "sec_a")
    private String sec_a;

    @Column(name = "balance")
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public int getMicr_no() {
        return micr_no;
    }

    public void setMicr_no(int micr_no) {
        this.micr_no = micr_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSec_q() {
        return sec_q;
    }

    public void setSec_q(String sec_q) {
        this.sec_q = sec_q;
    }

    public String getSec_a() {
        return sec_a;
    }

    public void setSec_a(String sec_a) {
        this.sec_a = sec_a;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

   
}
