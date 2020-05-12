package com.servlet;

import com.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequestMapping("/test")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("ok");

        ServletContext servletContext=getServletContext();
        ApplicationContext applicationContext=
                (ApplicationContext)servletContext.getAttribute("applicationContext");
        System.out.println(applicationContext);
        User user=applicationContext.getBean("user",User.class);
        System.out.println(user);
    }
}
