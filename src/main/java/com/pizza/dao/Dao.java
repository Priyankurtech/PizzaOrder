package com.pizza.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.pizza.dto.Pizza;

public class Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pizza");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void save(Pizza pizza) {
		entityTransaction.begin();
		entityManager.persist(pizza);
		entityTransaction.commit();
	}

	public List<Pizza> fetchAlltask() {
		return entityManager.createQuery("select x from Pizza x").getResultList();
	}
}
