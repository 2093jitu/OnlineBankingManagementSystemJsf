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
@Table(name="newstatement")
public class Statement implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    int id;
    
    @Column(name="name")
    String name;
    
    @Column(name="acc")
    int acc;
    
    @Column(name="date")
    Date date;
    
    @Column(name="depo")
    int depo;
    
    @Column(name="transfer")
    int transfer;
    
    @Column(name="transfar_acc")
    int transfar_acc;
    
    @Column(name="withdraw")
    int withdraw;

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

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDepo() {
        return depo;
    }

    public void setDepo(int depo) {
        this.depo = depo;
    }

    public int getTransfer() {
        return transfer;
    }

    public void setTransfer(int transfer) {
        this.transfer = transfer;
    }

    public int getTransfar_acc() {
        return transfar_acc;
    }

    public void setTransfar_acc(int transfar_acc) {
        this.transfar_acc = transfar_acc;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }
    
    
    
    
}
