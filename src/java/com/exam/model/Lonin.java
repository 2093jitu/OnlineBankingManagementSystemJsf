/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.model;

import com.exam.util.HibernateUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
@Entity
@Table(name = "lonin")
@ManagedBean
@SessionScoped
public class Lonin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String successfullyLogin() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("From Lonin where email=:email and password=:password");
            query.setString("email", email);
            query.setString("password", password);
            List list = query.list();

            if (list.size() == 1) {
                return "adminHome";
            } else {
                return "index";
            }

        } catch (Exception e) {
        }

        return null;
    }
}
