package com.servlet;

import com.domain.Video;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import sun.security.krb5.internal.APOptions;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class VideoServlet extends HttpServlet {

    private List<Video> videos=null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext=getServletContext();
        ApplicationContext applicationContext=(ApplicationContext)servletContext.getAttribute("applicationContext");
        UserService userService=applicationContext.getBean("userService",UserService.class);
        String message=null;

        try{
            message=req.getParameter("video_message");
        }
        catch (Exception e){
            System.out.println("第一次加载界面时运行");
        }
        if(null!=message){
            System.out.println(message);
            videos=userService.serchVideos(message);
        }
        else {
            videos=userService.getVideos();
        }
        req.setAttribute("videos",videos);
        req.getRequestDispatcher("message.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
