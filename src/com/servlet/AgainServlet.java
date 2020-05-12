package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AgainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("cookie1")!=null)
        {
            Cookie c1=(Cookie)req.getSession().getAttribute("cookie1");
            Cookie c2=(Cookie)req.getSession().getAttribute("cookie2");
            req.setAttribute("rusername",c1.getValue());
            req.setAttribute("rpassword",c2.getValue());
        }
        else {
            req.setAttribute("rusername","");
            req.setAttribute("rpassword","");
        }
        req.getRequestDispatcher("/login.jsp").forward(req,resp);
    }
}
