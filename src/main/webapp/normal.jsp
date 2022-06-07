<%@page import="ecom.entities.User"%>
<% 
   User user=(User)session.getAttribute("content type");
   if(user == null){
    session.setAttribute("message","Login First");
   response.sendRedirect("login.jsp");
   return;
    }
    else if(user!=null){
    if(user.getUserType().equals("admin")){
    session.setAttribute("message","UnAuthorized User");
    response.sendRedirect("login.jsp");
    return;
    }
    
    }
        %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Normal Here</h1>
    </body>
</html>
