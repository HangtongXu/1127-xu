package com.domain;

import com.dao.UserDao;

public class User {

    private String username;
    private String password;

    public User(String username, String password, UserDao userDao) {
        this.username = username;
        this.password = password;
        userDao.userCreate(this);
    }

    public User() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
