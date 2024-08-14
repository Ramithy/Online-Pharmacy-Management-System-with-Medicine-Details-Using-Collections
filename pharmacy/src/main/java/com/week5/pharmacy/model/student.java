package com.week5.pharmacy.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String department;

    private String phonenumber;

    public student() {

    }

    public student(String firstName, String lastName, String emailId) {
        super();
        this.name = name;
        this.department = department;
        this.phonenumber=phonenumber;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String firstName) {
        this.name=name;
    }
    public String getdepartment() {
        return department;
    }
    public void setdepartment(String lastName) {
        this.department= department;
    }
    public String getPhoneno() {
        return phonenumber;
    }
    public void setphonenumber(String emailId) {
        this.phonenumber = phonenumber;
    }
}
