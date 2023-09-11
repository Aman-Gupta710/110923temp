package com.servlets;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
 
public class FirstServlet implements Servlet{
    //life circle methods:
    
    ServletConfig conf;
    public void init(ServletConfig conf)                                 //  1..
    {
        this.conf=conf;
        System.out.println("Creating objects:......");
    }
    
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException  // 2.
    {
        System.out.println("Servicing.......This is my first out via Servlet Interface class");
        //set the content type of response
        resp.setContentType("Text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>This is my output from Servlet method interface class when we put GO on task bar</h1>");
    }
    
    public void destroy()                                               // 3.
    {
        System.out.println("going to destroy servlet object");
    }
    
    //NON-life circle methods:
    
    public ServletConfig getServletConfig()
    {
        return this.conf; 
    }
    
    public String getServletInfo()
    {
        return "this servlet is creted by aman gupta";
    }
    
}
