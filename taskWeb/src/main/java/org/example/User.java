package org.example;

import java.sql.Date;

public class User {
    private int id;
    private String login;
    private String email;
    private String password;
    private String sex;

    public User() {
    }

    public User(int id, String login, String email, String password, String sex) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.password = password;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return
                "Login: " + login + "<br>Email: " + email + "<br>Password: " + password +  "<br>Sex: " + sex + "\n";
    }
}
