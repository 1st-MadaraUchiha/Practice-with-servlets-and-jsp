/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ecom.servlet;

import ecom.entities.User;
import ecom.tests.Testers;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class AddUsers extends HttpServlet {
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = res.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        
	String userName= req.getParameter("user_name");
	 String userEmail = req.getParameter("user_email");
	 String userPassword = req.getParameter("user_password");
	 String userPhone = req.getParameter("user_phone");
	 String userAddress= req.getParameter("user_address");
         String userPicture ="default.png";
         
	 User user = new User(userName, userEmail, userPassword, userPhone,userPicture,userAddress,"normal");
         
         int userId;
            try (Session s = Testers.factory().openSession()) {
                Transaction tx = s.beginTransaction();
                userId = (int) s.save(user);
                tx.commit();
                s.close();
            }
            out.println(userId);
            HttpSession session = req.getSession();
	    session.setAttribute("message","You are registered now and your Id is: "+userId);
            res.sendRedirect("register.jsp");
            return;
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
