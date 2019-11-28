package com.ustglobal.jspwithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jspwithhibernate.dto.Product;

public class ReattachingDemo {

	public static void main(String[] args) {

		EntityTransaction entityTransaction  = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();

			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			Product info = entityManager.find(Product.class, 101);
			
			System.out.println(entityManager.contains(info));
			entityManager.detach(info);
			System.out.println(entityManager.contains(info));
			Product info1 = entityManager.merge(info);
			info1.setPname("Moblie1");
			System.out.println("Updated Record");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}

}
