package com.servlet;

import com.domain.User;
import com.domain.Video;
import com.service.UserService;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class VideoModifyServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext=getServletContext();
        ApplicationContext applicationContext=(ApplicationContext)servletContext.getAttribute("applicationContext");
        UserService userService=applicationContext.getBean("userService",UserService.class);
        System.out.println(req.getParameter("v_id"));
        if(null==req.getParameter("v_id"))
        {
            System.out.println(11111);
            Video video=applicationContext.getBean("video",Video.class);
            video.setV_name(req.getParameter("v_name"));
            video.setV_url(req.getParameter("v_url"));
            userService.newVideo(video);
        }
        else {
            System.out.println(22222);
            userService.deleteVideo(Integer.parseInt(req.getParameter("v_id")));
        }
        resp.sendRedirect("/video");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
