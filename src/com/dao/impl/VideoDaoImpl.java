package com.dao.impl;

import com.dao.VideoDao;
import com.domain.Video;
import jdk.internal.util.xml.impl.Input;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public class VideoDaoImpl implements VideoDao {

    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    public VideoDaoImpl(){
        InputStream im=Thread.currentThread().getContextClassLoader().getResourceAsStream("config.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(im);
    }
    @Override
    public List<Video> getAllVideos() {
        sqlSession=sqlSessionFactory.openSession();
        List<Video> videos=sqlSession.selectList("getAllVideos");
        sqlSession.commit();;
        sqlSession.close();
        return videos;
    }

    @Override
    public List<Video> serchVideos(String messge) {
        sqlSession=sqlSessionFactory.openSession();
        messge="%"+messge+"%";
        List<Video> videos=sqlSession.selectList("serchVideos",messge);
        return videos;
    }

    @Override
    public void newVideo(Video video) {

        sqlSession=sqlSessionFactory.openSession();
        int count=sqlSession.insert("newVideo",video);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteVideo(Integer id) {
        sqlSession=sqlSessionFactory.openSession();
        int count=sqlSession.delete("deleteVideo",id);
        sqlSession.commit();
        sqlSession.close();
    }
}
