/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.model;


import java.io.Serializable;
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
@Table(name = "new_balance")
public class Balance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    String name;

    @Column(name = "acc")
    int acc;

    @Column(name = "micr_no")
    int micr_no;

    @Column(name = "balance")
    int balance;
    

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public int getMicr_no() {
        return micr_no;
    }

    public void setMicr_no(int micr_no) {
        this.micr_no = micr_no;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

}
