package com.servlet;

import com.domain.User;
import com.service.UserService;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext=getServletContext();
        ApplicationContext applicationContext=(ApplicationContext)servletContext.getAttribute("applicationContext");

//        System.out.println(applicationContext);
        UserService userService=applicationContext.getBean("userService",UserService.class);
//        System.out.println(userService);

        User user=new User();
        user.setUsername(req.getParameter("username"));
        user.setPassword(req.getParameter("password"));
        if(!userService.userRegister(user))
        {
            req.getSession().setAttribute("message","注册失败，请稍后再试");
            req.getRequestDispatcher("/register.jsp").forward(req,resp);
        }
        else {
            req.getSession().setAttribute("message", "注册成功，请登录");
            resp.sendRedirect("/login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
