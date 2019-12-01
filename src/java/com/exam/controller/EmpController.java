/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.controller;

import com.exam.model.Employee;
import com.exam.util.HibernateUtil;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MM JITU
 */
@ManagedBean
@SessionScoped
public class EmpController {

    Employee emp = new Employee();

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public void saveEmployee() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {

            tx = s.beginTransaction();
            s.save(emp);
            tx.commit();
            FacesContext contex = FacesContext.getCurrentInstance();
            contex.addMessage(null, new FacesMessage("Add Employee seccessfully"));
            s.flush();
        } catch (Exception e) {
            tx.rollback();
        }

    }

    public List<Employee> showEmpInfo() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx=s.beginTransaction();
            Query q=s.createQuery("FROM Employee");
            List<Employee> list=q.list();
            s.flush();
            return list;
        } catch (Exception e) {
            s.getTransaction().rollback();
        }

        return null;
    }
    
    public String empEdit(Employee empin){
    emp.setId(empin.getId());
    emp.setName(empin.getName());
    emp.setEmp_id(empin.getEmp_id());
    emp.setDegi(empin.getDegi());
    emp.setAddress(empin.getAddress());    
    emp.setEmail(empin.getEmail());
    emp.setPhon(empin.getPhon());
    emp.setJoin_date(empin.getJoin_date());
    emp.setGender(empin.getGender());
    emp.setSalary(empin.getSalary());
    return "empEdit";
    }
    
       
    public String deleteEmployee(Employee empd) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {

            tx = s.beginTransaction();
            s.delete(empd);
            tx.commit();            
            s.flush();
        } catch (Exception e) {
            tx.rollback();
        }
        
        return "employeeInfo";

    }
    
    
    public void upEmployee() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {

            tx = s.beginTransaction();
            s.update(emp);
            tx.commit();
            FacesContext contex = FacesContext.getCurrentInstance();
            contex.addMessage(null, new FacesMessage("Employee Update seccessfully"));
            s.flush();
        } catch (Exception e) {
            tx.rollback();
        }

    }

    
    
    
    

}
