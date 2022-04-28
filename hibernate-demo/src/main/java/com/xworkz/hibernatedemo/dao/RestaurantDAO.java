package com.xworkz.hibernatedemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernatedemo.entity.RestaurantEntity;

public class RestaurantDAO {
public void saveRestaurant(RestaurantEntity entity) {

		
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//20 coonections are created when buildsessionfactory()
		//SessionFactory it is thread safe and immutable --- it is interface
		
		Session session = sessionFactory.openSession();
		//session is used for crud operations
		
		// In hibernate autoCommit is false.
		Transaction transaction = session.beginTransaction();
		//
		
		session.persist(entity);

		transaction.commit();// it will save the data in the table.
	}
}
