package com.servlet;

import com.dao.UserDao;
import com.domain.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext=getServletContext();
        ApplicationContext ac=(ApplicationContext)servletContext.getAttribute("applicationContext");

        String username=(String)req.getParameter("username");
        String password=(String)req.getParameter("password");
        String check=req.getParameter("check");
        System.out.println(check);
        if(check!=null) {
            Cookie cookie1=new Cookie("username",username);
            Cookie cookie2=new Cookie("password",username);
            req.getSession().setAttribute("cookie1",cookie1);
            req.getSession().setAttribute("cookie2",cookie2);
        }
        else
        {
            req.getSession().setAttribute("cookie1",null);
            req.getSession().setAttribute("cookie2",null);
        }

        User user1=new User();
        user1.setPassword(password);
        user1.setUsername(username);
        UserService userService=ac.getBean("userService",UserService.class);
//        System.out.println(userService);
        if(userService.userLigon(user1)){
            req.setAttribute("username",username);
            req.setAttribute("password",password);
            req.getRequestDispatcher("/success.jsp").forward(req,resp);
        }
        else {
            String message="用户名密码错误";
            req.getSession().setAttribute("message",message);
            resp.sendRedirect("/error.jsp");
        }
    }
}
