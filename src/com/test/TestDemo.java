package com.test;

import com.dao.UserDao;
import com.domain.User;
import com.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

//    @Autowired
//    User user;
//    @Autowired
//    UserDao userDao;
//    @Autowired
//    UserService userService;
    public static void main(String[] args) {
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=ac.getBean("user",User.class);
        UserDao userDao=ac.getBean("userDao",UserDao.class);
        UserService userService=ac.getBean("userService",UserService.class);

        System.out.println(userService);
        User user1=new User();
        user1.setUsername("111");
        user1.setPassword("111");
        System.out.println(userService.userLigon(user1));
    }
}
