
package ecom.servlet;

import ecom.dao.UserDao;
import ecom.entities.User;
import ecom.tests.Testers;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet {
protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = res.getWriter()) {
           String userName = req.getParameter("user_name");
           String userPassword = req.getParameter("user_password");
           String userEmail = req.getParameter("user_email");
           
           UserDao userDao = new UserDao(Testers.factory());
           User user = userDao.getUser(userName, userEmail, userPassword);
                            
            HttpSession session = req.getSession();                
            if(user == null)  
            { 
              session.setAttribute("message","Invalid Details");
              res.sendRedirect("login.jsp");
              return;
            }
           session.setAttribute("content type",user);
           if(user.getUserType().equals("admin")){
               res.sendRedirect("admin.jsp");
           }
           else if (user.getUserType().equals("normal")){
               res.sendRedirect("normal.jsp");
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