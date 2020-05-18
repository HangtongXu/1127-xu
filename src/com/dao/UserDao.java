package com.dao;

import com.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    public User getUser(String username);
    public boolean login(User user);
    public boolean userRegister(User user);
    public List<User> getAllUser();
}
