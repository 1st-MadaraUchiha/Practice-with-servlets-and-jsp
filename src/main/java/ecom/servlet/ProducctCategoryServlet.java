/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ecom.servlet;

import ecom.dao.CategoryDao;
import ecom.dao.ProductDao;
import ecom.entities.Category;
import ecom.entities.Product;
import ecom.tests.Testers;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class ProducctCategoryServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
           
           String marks = request.getParameter("operation");
           if(marks.trim().equals("addCategory")){
            String categoryName = request.getParameter("addcategoryname");
            String categoryDescription = request.getParameter("addcategorydescription");
               Category cat = new Category();
               cat.setCategoryTitle(categoryName);
               cat.setCategoryDescription(categoryDescription);
               System.out.println(cat.getCategoryTitle()+" "+cat.getCategoryDescription());
               CategoryDao pro  = new CategoryDao(Testers.factory());
               int id = pro.pcs(cat);  
               out.println("Category Saved");
           }
           if(marks.trim().equals("addProduct")){
              String pName= request.getParameter("addproductname");
              String pDesc = request.getParameter("addproductdescription");
              int catId = Integer.parseInt(request.getParameter("selectcategory"));
              Part part = request.getPart("addproductphoto");
              int pPrice = Integer.parseInt(request.getParameter("addproductprice"));
              int pDiscount = Integer.parseInt(request.getParameter("addproductdiscount"));
              int pQuantity = Integer.parseInt(request.getParameter("addproductquantity"));
              
               Product pro = new Product();
               pro.setpPhoto(part.getSubmittedFileName());
               pro.setpName(pName);
               pro.setpDesc(pDesc);
               pro.setpId(catId);
               pro.setpPrice(pPrice);
               pro.setpDiscount(pDiscount);
               pro.setpQuantity(pQuantity);
               
               CategoryDao cdo = new CategoryDao(Testers.factory());
               
               Category cat = cdo.getId(catId);
               pro.setCategory(cat);
               int pId = new ProductDao(Testers.factory()).productsList(pro);
               String path = request.getRealPath("component")+File.separator+"image"+File.separator+"product"+File.separator+part.getSubmittedFileName();
                
                   try (FileOutputStream fos = new FileOutputStream("E:/java projects/java eclipse project/ServletEComProject/src/main/webapp/WEB-INF/component/image/product/"+part.getSubmittedFileName())) {
                       InputStream is = part.getInputStream();
                       byte[] data = new byte[is.available()];
                       is.read(data);
                       fos.write(data);
                       fos.close();
                   }
          
                catch(IOException e){
                    e.printStackTrace();
                }
               
              
               
           }
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
