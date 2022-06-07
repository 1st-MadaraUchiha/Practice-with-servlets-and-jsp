/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecom.dao;

import ecom.entities.Category;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CategoryDao {
    SessionFactory factory;
    
    public CategoryDao(SessionFactory factory){
        this.factory = factory;
    }
    
    
      public int pcs (Category cat){
          
//          String q="insert into Category where category_Title='"+name+"' and category_Description='"+Description+"'";
          Session ss = factory.openSession();
          Transaction tx = ss.beginTransaction();
//          Query qy = ss.createQuery(q);
          int i = (int)ss.save(cat);
          tx.commit();
          ss.close();
          return  i;
          
          
       }
      public List<Category> list (){
        Session ss= this.factory.openSession();
        Query qy = ss.createQuery("from Category");
        List <Category> result=qy.list();
         return result;
          
      }
      
      public Category getId(int cId){
       Category cat = null;
       Session ss = this.factory.openSession();
        cat = ss.get(Category.class,cId);
            return cat;
        }
    
}
