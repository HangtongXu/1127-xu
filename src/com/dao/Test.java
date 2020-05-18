package com.dao;

import com.dao.impl.UserDaoImpl;

public class Test {
    public static void main(String[] args) {
        UserDao userDao=new UserDaoImpl();
        System.out.println(userDao.getUser("12345"));

    }
}
