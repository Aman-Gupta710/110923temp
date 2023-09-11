package com.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class secondservlet extends HttpServlet{
   @Override
   public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("Text/html");
        PrintWriter out=response.getWriter();
        
        out.println("<h2>2.welcome after click to submit button to Registerservlet</h2>");
   }       
}

