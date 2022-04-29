package com.xworkz.tvchannelapp.impl;

import com.xworkz.tvchannelapp.dao.TvChannelDAO;
import com.xworkz.tvchannelapp.entity.TvChannel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TvChannleDAOImpl implements TvChannelDAO {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tv");

	@Override
	public void saveChannel(TvChannel channel) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(channel);
			entityTransaction.commit();
		} catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
		} finally {
			if (entityManager != null)
				entityManager.close();
		}
	}

	@Override
	public TvChannel getChannelById(int channelId) {
		EntityManager entityManager = null;
		TvChannel channel2 = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			channel2 = entityManager.find(TvChannel.class, channelId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null)
				entityManager.close();
		}
		return channel2;

	}

	@Override
	public void updateChannelPriceById(int channelId, double price) {
		EntityManager entityManager = null;
		TvChannel channel2 = null;
		EntityTransaction entityTransaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			channel2 = entityManager.find(TvChannel.class, channelId);
			if (channel2 != null) {
				entityTransaction = entityManager.getTransaction();
				entityTransaction.begin();
				channel2.setPrice(price);
				entityManager.merge(channel2);
				entityTransaction.commit();
				System.out.println("updated..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null)
				entityManager.close();
		}
	}

}
