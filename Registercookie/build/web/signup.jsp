<%-- 
    Document   : signup
    Created on : 8 Jun, 2022, 9:11:46 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

         <!-- Compiled and minified JavaScript -->
         <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            
    </head>
    <body style="background: url(img/hotel7.jpg);background-size:cover; background-attachment: fixed; ">
        <div class =" container">
            <div class="row">
                <div class="col m6 offset-m3">
                    <div class ="card">
                        <div class ="card-content">
                            <h1 style="margin-top: 0px;" class="center-align">Register here </h1>
                            
                            
                          
                            <div class ="form center-align">
                                <form action="Register" method="post">
                                    <input type="text" name="username" placeholder="Enter your name">
                                    <input type="password" name="password" placeholder="Enter your password">
                                    <input type="email" name="email" placeholder="Enter your email">
                                    
                                    <button type="submit" class ="btn ">SUBMIT</button>
                                </form>    
                                
                            </div>
                           
                            <div class="loader center-align" style="margin-top: 10px; display: none">
                                <div class="preloader-wrapper big active">
                                    <div class="spinner-layer spinner-blue-only">
                                      <div class="circle-clipper left">
                                        <div class="circle"></div>
                                      </div><div class="gap-patch">
                                        <div class="circle"></div>
                                      </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                      </div>
                                    </div>
                                  

                                    <div class="spinner-layer spinner-red-only">
                                      <div class="circle-clipper left">
                                        <div class="circle"></div>
                                      </div><div class="gap-patch">
                                        <div class="circle"></div>
                                      </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                      </div>
                                    </div>
                                  

                                  
                                    <div class="spinner-layer spinner-green-only">
                                      <div class="circle-clipper left">
                                        <div class="circle"></div>
                                      </div><div class="gap-patch">
                                        <div class="circle"></div>
                                      </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                      </div>
                                    </div>
                                  </div>
                               <h5>please wait...</h5>
                            </div>
                            
                                                   
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
            crossorigin="anonymous">
        </script>
          
          <script>
              $(documnet).ready(function (){
                  console.log("page is ready.....");
              })
          </script>    
    </body>
    
</html>
