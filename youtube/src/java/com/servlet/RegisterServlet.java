package com.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet{
   public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("Text/html");
        PrintWriter out=response.getWriter();
        
        out.println("<h2>welcome after click to submit button to Registerservlet</h2>");
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_Course");
        String condition  = request.getParameter("condition");
    
        if(condition!=null)
        {
            if(condition.equals("checked")){
                out.println("<h2> Name : "+name+"<h2>");     
                out.println("<h2> Password : "+password+"<h2>");     
                out.println("<h2> email : "+email+"<h2>");     
                out.println("<h2> Gender : "+gender+"<h2>");     
                out.println("<h2> Course : "+course+"<h2>");
                
                RequestDispatcher rd = request.getRequestDispatcher("Servlet");
                rd.forward(request, response);
            }else{
                out.println("</h2>you have not accepeted terms and conditions</h2>");
            }
        }else{
            out.println("</h2>you have not accepeted terms and conditions</h2>");
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response);
                
        }
   }    
}
