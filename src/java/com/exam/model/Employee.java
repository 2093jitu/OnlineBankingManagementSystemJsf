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

@Table(name = "employee")
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "emp_id")
    String emp_id;

    @Column(name = "degi")
    String degi;

    @Column(name = "address")
    String address;

    @Column(name = "email")
    String email;
    
    @Column(name = "phon")
    String phon;

    @Column(name = "join_date")
    Date join_date;

    @Column(name = "gender")
    String gender;
    
    @Column(name = "salary")
    int salary;

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

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getDegi() {
        return degi;
    }

    public void setDegi(String degi) {
        this.degi = degi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhon() {
        return phon;
    }

    public void setPhon(String phon) {
        this.phon = phon;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
    
    
}
