
package ecom.dao;

import ecom.entities.Product;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ProductDao {
    
    SessionFactory factory;

       
   public  ProductDao(SessionFactory factory){
       this.factory = factory;
   } 
 
   public int productsList (Product product){
       Session ss = this.factory.openSession();
       Transaction tx = ss.beginTransaction();
       int i =(Integer) ss.save(product);
       tx.commit();
       ss.close();
       return i;
   }
   public List<Product> list (){
     Session s = this.factory.openSession();
     Query q = s.createQuery("from Product");
     List<Product> listing = q.list();
     return listing;
   }
   public List<Product> list (int id){
     Session s = this.factory.openSession();
     Query q = s.createQuery("from Product as p where p.category.categoryId =:kk");
     q.setParameter("kk", id);
     List<Product> listing = q.list();
     return listing;
   }
   }

