/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.controller;

import com.exam.model.AccountRequest;

import com.exam.util.HibernateUtil;
import java.util.List;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@ManagedBean
@RequestScoped
public class AccountReqCon {

   AccountRequest accountReq= new AccountRequest ();

    public AccountRequest getAccountReq() {
        return accountReq;
    }

    public void setAccountReq(AccountRequest accountReq) {
        this.accountReq = accountReq;
    }

   
  
    
    public void saveAccReq() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {       
            accountReq.setStatues("request");
            tx = s.beginTransaction();
            s.save(accountReq);
            tx.commit();
            FacesContext contex=FacesContext.getCurrentInstance();
            contex.addMessage(null, new FacesMessage("Send A Account Requst seccessfully"));
            s.flush();
        } catch (Exception e) {
            tx.rollback();
        }

    }
    
    public List<AccountRequest> showAccReqData() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM AccountRequest");
            List<AccountRequest> list = query.list();
            //tx.commit();
            session.flush();
            return list;
        } catch (HibernateException e) {
            //session.getTransaction().rollback();
            tx.rollback();
        }
        return null;

    }

}
