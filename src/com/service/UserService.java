package com.service;

import com.domain.User;
import com.domain.Video;

import java.util.List;

public interface UserService {

    public boolean userLigon(User user);
    public boolean userRegister(User user);
    public List<Video> getVideos();
    public List<Video> serchVideos(String message);
    public boolean newVideo(Video video);
    public boolean deleteVideo(Integer id);
}
