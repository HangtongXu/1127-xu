package com.dao.impl;

import com.dao.UserDao;
import com.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private SqlSession sqlSession=null;
    private SqlSessionFactory sqlSessionFactory=null;

    public UserDaoImpl(){
        InputStream im= Thread.currentThread().getContextClassLoader().getResourceAsStream("config.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(im);
    }
    @Override
    public User getUser(String username) {
        sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("getUser",username);
        sqlSession.close();
        return user;
    }


    @Override
    public boolean login(User user) {
        boolean result=false;
        sqlSession=sqlSessionFactory.openSession();
        if(getUser(user.getUsername())!=null){
            result=user.getPassword().equals(getUser(user.getUsername()).getPassword());
        }
        sqlSession.close();
        return result;
    }

    @Override
    public boolean userRegister(User user) {
        sqlSession=sqlSessionFactory.openSession();
        int num=sqlSession.insert("userRegister",user);
        sqlSession.commit();
        sqlSession.close();
        if(num>0)
            return true;
        else
            return false;
    }

    @Override
    public List<User> getAllUser() {
        sqlSession=sqlSessionFactory.openSession();
        List<User> users=sqlSession.selectList("getAllUser");
        sqlSession.commit();
        sqlSession.close();
        return users;
    }
}
