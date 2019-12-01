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
@Table(name = "loan")
public class Loan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "city")
    String city;
    @Column(name = "nid_no")
    String nid_no;
    @Column(name = "gender")
    String gender;
    @Column(name = "emp_position")
    String emp_position;
    @Column(name = "nationality")
    String nationality;
    @Column(name = "loanamount")
    String loanamount;
    @Column(name = "tmofloan")
    String tmofloan;
    @Column(name = "requestdate")
    Date requestdate;
    @Column(name = "staturs")
    String staturs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNid_no() {
        return nid_no;
    }

    public void setNid_no(String nid_no) {
        this.nid_no = nid_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmp_position() {
        return emp_position;
    }

    public void setEmp_position(String emp_position) {
        this.emp_position = emp_position;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(String loanamount) {
        this.loanamount = loanamount;
    }

    public String getTmofloan() {
        return tmofloan;
    }

    public void setTmofloan(String tmofloan) {
        this.tmofloan = tmofloan;
    }

    public Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }

    public String getStaturs() {
        return staturs;
    }

    public void setStaturs(String staturs) {
        this.staturs = staturs;
    }

}
