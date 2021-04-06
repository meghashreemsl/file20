package com.wolken.wolkenapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wolken.wolkenapp.dto.FruitDTO;

public class FruitDAOImpl implements FruitDAO {
	
	FruitDTO dto = new FruitDTO();
	

	@Override
	public void createFruit(FruitDTO dto) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(FruitDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		factory.close();
		
	}


	/*@Override
	public void update(int fruitId, String fruitName) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(FruitDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(dto);
		transaction.commit();
		session.close();
		factory.close();
		
	
		
	}
*/

/*	@Override
	public void delete(FruitDTO dto) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(FruitDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(dto);
		transaction.commit();
		session.close();
		factory.close();
		
	}
*/

	@Override
	public void delete(int fruitId) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(FruitDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		FruitDTO dto1 =session.get(FruitDTO.class, fruitId);
		Transaction transaction = session.beginTransaction();
		session.delete(dto1);
		transaction.commit();
		session.close();
		factory.close();
		
	
	}


}
