package com.xworkz.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dogEtity.DogEntity;

public class DogDaoImplSQL implements DogDao {

	@Override
	public void saveDog(DogEntity dogEntity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDogById() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDog() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDog() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDogNameByColor(String color, String name) {
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Query query = session.getNamedSQLQuery("updateDogNameByColorSQL");
			query.executeUpdate();

			transaction.commit();
			sessionFactory.close();
			System.out.println(" successfully updated");

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void updateDogWeightByName(String name, double weight) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDogNameByWeight(double weight, String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDogColorByname(String name,String color) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDogIdByName(String name,int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDogWeightById(int id,double weight) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllDogEntity() {

		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			configuration = new Configuration();
			configuration.configure("dog.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
//			javax.persistence.Query query = session.createQuery("from DogEntity");
			Query query = session.getNamedSQLQuery("getAllDogEntity");
			List list = query.getResultList();
			System.out.println(list);

			sessionFactory.close();

		} catch (Exception e) {

		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void deleteDogEntityByName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDogMinWeight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDogMaxWeight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDogAvgWeight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDogSumOfWeight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDogNameLikeP() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDogNameEndsWithY() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDogWeightBetween10And65() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDogByName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDogDuplicateByColor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDogByWeightAndId() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDogByNameOrColour() {
		// TODO Auto-generated method stub

	}

}
