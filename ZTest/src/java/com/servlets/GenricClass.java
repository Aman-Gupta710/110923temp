package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenricClass extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       System.out.println("This is my secondout via GenericServlet");  
       res.setContentType("text/html");
       PrintWriter out = res.getWriter();
       out.println("<h1>This is my output from Generic class when we put run on task bar</h1>");
    }
           
}
