package com.dao.impl;

import com.dao.UserDao;
import com.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements UserDao {

    private Map<String,User> userMap=new HashMap<String, User>();

    @Override
    public User getUser(String username) {
        return userMap.get(username);
    }

    @Override
    public boolean checkUser(String username) {
        if(this.userMap.containsKey(username))
            return true;
        else
            return false;
    }

    @Override
    public boolean userCreate(User user) {
        userMap.put(user.getUsername(),user);
        return true;
    }

    @Override
    public boolean login(User user) {
        String username=user.getUsername();
        String password=user.getPassword();
        if(this.checkUser(username)&&password.equals(this.getUser(username).getPassword()))
        return true;
        else {
            try {
                new RuntimeException().printStackTrace();
            }
            catch (Exception e){
                System.out.println("出错了");
            }
            return false;
        }
    }

    @Override
    public boolean userRegister(User user) {
        if(null!=user&&!userMap.containsKey(user.getUsername()))
        {
            userMap.put(user.getUsername(),user);
            System.out.println(userMap);
            return true;
        }
        else
            return false;
    }
}
