package com.ustglobal.jspwithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jspwithhibernate.dto.Product;

public class UpdateDemo {
public static void main(String[] args) {

	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Product info = entityManager.find(Product.class, 100);
		info.setPname("NAME");
		info.setQuantity(13);
		System.out.println("Update Record");
		entityTransaction.commit();
	} catch (Exception e) {

		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}
}

