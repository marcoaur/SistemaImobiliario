package br.com.sistemaImobiliario.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class HibernateUtilTest {
	
	@Test
	public void conectar(){
		
		SessionFactory factory =  new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.close();
		
		
	}

}
