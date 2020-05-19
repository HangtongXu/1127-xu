package com.service.impl;

import com.dao.UserDao;
import com.dao.VideoDao;
import com.domain.User;
import com.domain.Video;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Autowired
    VideoDao videoDao;
    @Override
    public boolean userLigon(User user) {
        return userDao.login(user);
    }

    @Override
    public boolean userRegister(User user) {
        return userDao.userRegister(user);
    }

    @Override
    public List<Video> getVideos() {
        return videoDao.getAllVideos();
    }

    @Override
    public List<Video> serchVideos(String message) {
        return videoDao.serchVideos(message);
    }

    public UserServiceImpl() {

    }
}
