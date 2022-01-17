package com.restapi.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "username", nullable = true, length = 100)
    private String username;
    @Column(name = "email", unique = true, nullable = true, length = 100)
    private String email;
    @Column(name = "password", nullable = true, length = 255)
    private String password;
    @Column(name = "lahir", nullable = true )
    private Date lahir;
    @Column(name = "telepon", nullable = true, length = 12)
    private String telepon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Date getLahir() {
        return lahir;
    }

    public void setLahir(Date lahir) {
        this.lahir = lahir;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }


    
}
