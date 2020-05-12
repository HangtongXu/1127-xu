package com.dao;

import com.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    public User getUser(String username);

    public boolean checkUser(String username);
    public boolean userCreate(User user);
    public boolean login(User user);
    public boolean userRegister(User user);
}
