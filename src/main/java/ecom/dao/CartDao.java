package ecom.dao;

import ecom.entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CartDao {
  
    SessionFactory factory;

    public CartDao(SessionFactory factory) {
        this.factory = factory;
    }
    
    public void Cart(Product product){
        Session ss = this.factory.openSession();
        Transaction tx = ss.beginTransaction();
        ss.beginTransaction();
        ss.save(product);
        tx.commit();
        ss.close();
    }
}
