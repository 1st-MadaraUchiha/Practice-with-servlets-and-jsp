<%@page import="ecom.helper.WordLimit"%>
<%@page import="ecom.entities.Product"%>
<%@page import="ecom.dao.ProductDao"%>
<%@page import="java.util.List"%>
<%@page import="ecom.dao.CategoryDao"%>
<%@page import="ecom.entities.Category"%>
<%@page import="ecom.tests.Testers"%>
<%@page import="ecom.helper.EnterProductDetailsInCart"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="WEB-INF/component/head.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="WEB-INF/component/navbar.jsp"%> 
        <%  
           int id = Integer.parseInt(request.getParameter("ids"));
           ProductDao pdo = new ProductDao(Testers.factory());
           List<Product> list = pdo.list();
           if(id==0){
           list = list;
           }
           
          else if(id!=0){
           List<Product> lists = pdo.list(id);
            list = lists;          
           }
           
          CategoryDao cdo = new CategoryDao(Testers.factory());
          List<Category> cat = cdo.list();
          %>
 
                  <!-----------------------------Code for view------------------------>
                  
                  <table class="table table-dark mx-3">
  <thead>
    <tr>
      <th scope="application"> <a href="index.jsp?ids=0">All Categories</a></th>
      <th scope="col">Product Name</th>
      <th scope="col">Product Description</th>
      <th scope="col">Product Price</th>
      <th scope="col">Product Image</th>
      <th scope="col">Add to Cart</th>
    </tr>
  </thead>
  <tbody >
    
         <% 
            for(Category cay:cat){
        %>
        <tr >
            <th scope="application" ><a href="index.jsp?ids=<%=cay.getCategoryId()%>"><%= cay.getCategoryTitle()%></a></th>
        </tr>
        <% } %>
        
             <% for(Product pr:list){%>
             
  <tr scope="col">
      <td></td>
  <td scope="col" ><%=pr.getpName()%> </th>
  <td scope="col"> <%= WordLimit.word(pr.getpDesc())%></th>
  <td scope="col" >&#36;<%= pr.getpPrice()-pr.getpDiscount() %><a class="btn btn-primary">&#36;<%=pr.getpDiscount()%> off</a></th>
  <td scope="col"><%= pr.getpPhoto()%> </th>
  <td scope="col">
      <button type="submit" class="btn btn-success" onclick="<% new EnterProductDetailsInCart(pr.getpId(),pr.getpName(),pr.getpPrice()-pr.getpDiscount()); %>">Add To Cart </button> 
      </th>
      
          </tr>
  <%
      }

  %>
  
  </tbody>
                  </table>
  <% 
           %>
	<%@include file="WEB-INF/component/jsscript.jsp"%>
</body>
</html>
