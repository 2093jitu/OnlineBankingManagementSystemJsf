/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.controller;

import com.exam.model.Loan;
import com.exam.util.HibernateUtil;
import java.util.List;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

@ManagedBean
@RequestScoped
public class ControllLoan {

    Loan loan = new Loan();

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public void saveLoanReq() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            loan.setStaturs("requst");
            tx = s.beginTransaction();
            s.save(loan);
            tx.commit();
            FacesContext contex=FacesContext.getCurrentInstance();
            contex.addMessage(null, new FacesMessage("send A Loan Request SuccessFully"));
            s.flush();
        } catch (Exception e) {
            tx.rollback();
        }

    }

    public List<Loan> showLoanRequest() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = s.beginTransaction();
            Query query = s.createQuery("FROM Loan");
            List<Loan> list = query.list();
            s.flush();
            return list;
        } catch (Exception e) {
             //s.getTransaction().rollback();
             tx.rollback();
        }

        return null;
    }

}
