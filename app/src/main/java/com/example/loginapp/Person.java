package com.example.loginapp;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String password;
    private String email;
    private String id;
    private boolean isdetailssave;

    public Person(String name, String password, String email, String id,Boolean isdetailssave) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.id = id;
        this.isdetailssave=isdetailssave;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public boolean getIsdetailssave() {
        return isdetailssave;
    }

    public void setIsdetailssave(boolean isdetailssave) {
        this.isdetailssave = isdetailssave;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", isdetailssave=" + isdetailssave +
                '}';
    }
}
