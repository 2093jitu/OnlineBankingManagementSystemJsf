/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.controller;

import com.exam.model.Balance;
import com.exam.model.CreateAccount;
import com.exam.model.Lonin;
import com.exam.model.Statement;
import com.exam.util.HibernateUtil;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@ManagedBean
@SessionScoped
public class ContollerCreateAccount {

    CreateAccount createAccount = new CreateAccount();
    Balance balance = new Balance();
    Statement statement = new Statement();    
    int depoBalance;
    int withdrowBalance;
    int transferAccountNo;
    int transferAmmount;

      
    
    
    public int getTransferAmmount() {
        return transferAmmount;
    }

    public void setTransferAmmount(int transferAmmount) {
        this.transferAmmount = transferAmmount;
    }

    public int getTransferAccountNo() {
        return transferAccountNo;
    }

    public void setTransferAccountNo(int transferAccountNo) {
        this.transferAccountNo = transferAccountNo;
    }

    public int getWithdrowBalance() {
        return withdrowBalance;
    }

    public void setWithdrowBalance(int withdrowBalance) {
        this.withdrowBalance = withdrowBalance;
    }

    public int getDepoBalance() {
        return depoBalance;
    }

    public void setDepoBalance(int depoBalance) {
        this.depoBalance = depoBalance;
    }

    public CreateAccount getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(CreateAccount createAccount) {
        this.createAccount = createAccount;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public void saveData(ContollerCreateAccount accountControll) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = s.beginTransaction();
            balance.setName(createAccount.getName());
            balance.setAcc(createAccount.getAcc());
            balance.setMicr_no(createAccount.getMicr_no());
            balance.setBalance((int) createAccount.getBalance());
            s.save(createAccount);
            tx.commit();
            FacesContext contex=FacesContext.getCurrentInstance();
            contex.addMessage(null, new FacesMessage("Create Account seccessfully"));
            s.flush();
        } catch (Exception e) {
            tx.rollback();
        }

        try {
            tx = s.beginTransaction();
            s.save(balance);
            tx.commit();
            s.flush();
        } catch (Exception e) {
            tx.rollback();
        }
        
    }

    public List<Balance> showBalance() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Balance");
            List<Balance> list =(List<Balance>) query.list();
            session.flush();
            return list;
           
        } catch (HibernateException e) {
           session.getTransaction().rollback();
             //session.close();
             //tx.rollback();
        } 
        return null;
    }

    public String depoShow(Balance bal) {
        balance.setId(bal.getId());
        balance.setName(bal.getName());
        balance.setAcc(bal.getAcc());
        balance.setMicr_no(bal.getMicr_no());
        balance.setBalance(bal.getBalance());

        return "dipoForm";
    }

    public void updateDepo() {
        int actualBal = balance.getBalance();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            balance.setBalance(actualBal + depoBalance);
            tx = session.beginTransaction();
            session.update(balance);
            saveStatement();
            tx.commit();
            FacesContext contex=FacesContext.getCurrentInstance();
            contex.addMessage(null, new FacesMessage("deposite seccessfully"));
            session.flush();
        } catch (HibernateException e) {
            tx.rollback();
        }

    }

    public String withdrowShow(Balance bal) {
        balance.setId(bal.getId());
        balance.setName(bal.getName());
        balance.setAcc(bal.getAcc());
        balance.setMicr_no(bal.getMicr_no());
        balance.setBalance(bal.getBalance());
        return "withdrowForm";
    }

    public void updateWithdrow() {
        int actualBal = balance.getBalance();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            balance.setBalance(actualBal - withdrowBalance);
            tx = session.beginTransaction();
            session.update(balance);
            saveStatement();            
            tx.commit();
            FacesContext contex=FacesContext.getCurrentInstance();
            contex.addMessage(null, new FacesMessage("Withwrow seccessfully"));
            session.flush();
        } catch (HibernateException e) {
            tx.rollback();
        } 

    }

    // start transfer
    public String tranasferShow(Balance bal) {
        balance.setId(bal.getId());
        balance.setName(bal.getName());
        balance.setAcc(bal.getAcc());
        balance.setMicr_no(bal.getMicr_no());
        balance.setBalance(bal.getBalance());
        return "tranasferForm";
    }

    public void updateTransfer() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        int actualBalance = balance.getBalance();
        try {
            balance.setBalance(actualBalance - transferAmmount);
            tx = s.beginTransaction();
            s.update(balance);
            tx.commit();
            FacesContext contex=FacesContext.getCurrentInstance();
            contex.addMessage(null, new FacesMessage("Transfer seccessfully"));
            s.flush();
        } catch (HibernateException e) {
            tx.rollback();
        }

        try {
            tx = s.beginTransaction();
            Query query = s.createQuery("UPDATE Balance set balance=:balance where acc=:acc");
            query.setInteger("balance", actualBalance);
            query.setInteger("acc", transferAccountNo);
            tx.commit();
            s.flush();

        } catch (HibernateException e) {
            tx.rollback();
        }

    }

    //start Statement
    public void saveStatement() {

        statement.setName(balance.getName());
        statement.setAcc(balance.getAcc());
        statement.setDate(new Date());
        statement.setDepo(depoBalance);
        //statement.setTransfer();
        //statement.setTransfar_acc(11111);
        statement.setWithdraw(withdrowBalance);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(statement);
            tx.commit();
            session.flush();
        } catch (HibernateException e) {
            tx.rollback();
        } 

    }

    public List<Statement> showStatement() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Statement");
            List<Statement> list = query.list();
            //tx.commit();
            session.flush();
            return list;
        } catch (HibernateException e) {
            //session.getTransaction().rollback();
            tx.rollback();
            
        }
        return null;

    }

    
    public List<CreateAccount> showCustomerList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM CreateAccount");
            List<CreateAccount> list = query.list();
            session.flush();
            return list;
           
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            // tx.rollback();
             //session.close();
        } 
        return null;
    }

}
