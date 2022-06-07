package ecom.tests;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Testers {

	private static SessionFactory factory;
	
	public static  SessionFactory factory() {
		
		if(factory == null) {
			factory = new Configuration().configure("/config.xml").buildSessionFactory();
		}
		return factory;
	}
}
