/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgmtsys.po;

/**
 *
 * @author welcome
 */
public class PatientPO {
     String p_id;
        String fname;
        String contactno;
        String gender;
        String address;   
        String age;
        String date;
        String time;
        String  perpos;
        String  bldgrp;
           String bed;

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }



    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
   
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPerpos() {
        return perpos;
    }

    public void setPerpos(String perpos) {
        this.perpos = perpos;
    }

    public String getBldgrp() {
        return bldgrp;
    }

    public void setBldgrp(String bldgrp) {
        this.bldgrp = bldgrp;
    }
    
}
