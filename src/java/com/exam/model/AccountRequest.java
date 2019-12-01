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

@Entity
@Table(name = "acc_req")
public class AccountRequest implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;

    @Column(name = "f_name")
    String f_name;

    @Column(name = "l_name")
    String l_name;

    @Column(name = "email")
    String email;

    @Column(name = "phon_no")
    String phon_no;

    @Column(name = "address")
    String address;

    @Column(name = "account_type")
    String account_type;

    @Column(name = "nid_no")
    String nid_no;

    @Column(name = "dob")
    Date dob;

    @Column(name = "statues")
    String statues;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhon_no() {
        return phon_no;
    }

    public void setPhon_no(String phon_no) {
        this.phon_no = phon_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getNid_no() {
        return nid_no;
    }

    public void setNid_no(String nid_no) {
        this.nid_no = nid_no;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getStatues() {
        return statues;
    }

    public void setStatues(String statues) {
        this.statues = statues;
    }

    
    
    
}
