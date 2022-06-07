
package ecom.dao;

import ecom.entities.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDao {
   private SessionFactory factory;
   User user = null;
   
   public UserDao(SessionFactory factory){
       this.factory = factory;
   }
   
   public User getUser(String name,String email,String password){
       try{
         String query= "from User where user_Name ='"+name+"' and user_Email ='"+email+"' and user_Password ='"+password+"'";
           try (Session session = this.factory.openSession()) {
               Query q = session.createQuery(query);
              user=(User)q.uniqueResult();
          
           }
       
       }catch(Exception e){
           e.printStackTrace();
       }
       return user;
   }
}