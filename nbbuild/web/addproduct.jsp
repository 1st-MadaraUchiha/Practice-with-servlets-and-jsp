<%@page import="ecom.entities.Category"%>
<%@page import="java.util.List"%>
<%@page import="ecom.tests.Testers"%>
<%@page import="ecom.dao.CategoryDao"%>
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

          <form action="ProductOperationServlet" method="post" enctype="multipart/form-data">
            <div class="px-5">
                <input type="hidden" name="operation" value="addProduct">
  <div class="form-group">
    <label for="addproductname">Product Name</label>
    <input type="text" name="addproductname" class="form-control" id="addproductname" placeholder="Enter product name">
  </div>
                <div class="form-group">
    <label for="addproductdescription">Product Description</label>
    <input type="text" name="addproductdescription" class="form-control" id="addproductdescription" placeholder="Enter product description">
  </div>
 <div class="form-group">
    <label for="addproductphoto">Product photo</label>
    <input type="file" name="addproductphoto" class="form-control" id="addproductphoto" placeholder="Select Photo">
  </div>
                
                <div class="form-group">
                    <label for="addproductcategory">Select Category</label>
         <select class="custom-select my-1 mr-sm-2 mx-2" name="selectcategory" id="selectcategory">
             <%
        CategoryDao catD = new CategoryDao(Testers.factory());
       List<Category> list = catD.list();
        
       for(Category c:list){
        
        %>
       
     
    <option selected value="<%= c.getCategoryId() %>"><%= c.getCategoryTitle()  %></option>
  
    
       <% }
        %>
    </select>
    
                
                <div class="form-group">
    <label for="addproductprice">Product price</label>
    <input type="number" name="addproductprice" class="form-control" id="addproductprice" placeholder="Enter product price">
  </div>
                
                <div class="form-group">
    <label for="addproductdiscount">Product Discount</label>
    <input type="number" name="addproductdiscount" class="form-control" id="addproductdiscount" placeholder="Enter product discount">
  </div>
                <div class="form-group">
    <label for="addproductquantity">Product quantity</label>
    <input type="number" name="addproductquantity" class="form-control" id="addproductquantity" placeholder="Enter product quantity">
  </div>
                <button type="submit" class="btn btn-success">Add Product</button>
</form>
          </div>
        <%@include file="WEB-INF/component/jsscript.jsp" %>
    </body>
</html>
