package com.ustglobal.jsawithhibernatestd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jsawithhibernatestd.dto.Std;

public class UpdateDemo {

	public static void main(String[] args) {

		EntityManager  entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Std info = entityManager.find(Std.class, 111);
			info.setName("VishnuPriya");
			info.setEmail("vishnupr@gmail.com");
			System.out.println("Updated");
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityTransaction.commit();
	}

}
