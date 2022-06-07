<%@include file="/WEB-INF/component/LoginValidator.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/component/head.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/component/navbar.jsp"%>
         <!--<h2><%@include file="WEB-INF/component/message.jsp" %></h2>-->
        <div class="px-3">
         <table class="table table-striped" >
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">User</th>
      <th scope="col">Category</th>
      <th scope="col">Product</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">Number</th>
      <td>32</td>
      <td>52</td>
      <td>64</td>
    </tr>
  </tbody>
</table>
        </div>
        
        <form>
            <div class="mx-3">
 <a href="addproduct.jsp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Add Product</a>
<a href="AddCategory.jsp" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Add Category</a>
            </div>
</form>
         <%@include file="WEB-INF/component/jsscript.jsp"%>
    </body>
</html>
