<%@page import="ecom.entities.User"%>
<% 
   User user=(User)session.getAttribute("content type");
   if(user == null){
    session.setAttribute("message","Login First");
   response.sendRedirect("login.jsp");
   return;
    }
    else if(user!=null){
    if(user.getUserType().equals("normal")){
    session.setAttribute("message","UnAuthorized User");
    response.sendRedirect("login.jsp");
    return;
    }
    
    }
        %>