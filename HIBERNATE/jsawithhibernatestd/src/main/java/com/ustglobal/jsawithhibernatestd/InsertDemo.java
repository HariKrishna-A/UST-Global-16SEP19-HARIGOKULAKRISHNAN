package com.ustglobal.jsawithhibernatestd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jsawithhibernatestd.dto.Std;

public class InsertDemo {

	public static void main(String[] args) {

		Std info = new Std();
		info.setId(110);
		info.setName("Vishnu");
		info.setEmail("vishnu@gmail.com");
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(info);
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}

}
