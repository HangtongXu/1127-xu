package com.dao;

import com.domain.Video;

import java.util.List;

public interface VideoDao {
    public List<Video> getAllVideos();
    public List<Video> serchVideos(String messge);
}
