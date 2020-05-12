package com.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        ServletContext servletContext=servletContextEvent.getServletContext();
        String springXML=servletContext.getInitParameter("springXML");

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(springXML);

        servletContext.setAttribute("applicationContext",applicationContext);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
