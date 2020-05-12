package com.service.impl;

import com.dao.UserDao;
import com.domain.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public boolean userLigon(User user) {
        return userDao.login(user);
    }

    @Override
    public boolean userRegister(User user) {
        return userDao.userRegister(user);
    }

    public UserServiceImpl() {

    }
}
