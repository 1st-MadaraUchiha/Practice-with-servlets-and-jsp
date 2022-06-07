<%@include file="WEB-INF/component/LoginValidator.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@include file="WEB-INF/component/head.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <%@include file="WEB-INF/component/navbar.jsp"%>

        <form action="ProductOperationServlet" method="post">
            <div class="px-5">
                <input type="hidden" name="operation" value="addCategory">
  <div class="form-group">
    <label for="addcategoryname">Category Name</label>
    <input type="text" name="addcategoryname" class="form-control" id="addcategoryname" placeholder="Enter category name">
  </div>
  <div class="form-group">
    <label for="addcategorydescription">Description</label>
    <textarea name="addcategorydescription" class="form-control" id="addcategorydescription" rows="3"></textarea>
  </div>
                <button type="submit" class="btn btn-success">Add Category</button>
</form>
          </div>
        <%@include file="WEB-INF/component/jsscript.jsp" %>
    </body>
</html>
