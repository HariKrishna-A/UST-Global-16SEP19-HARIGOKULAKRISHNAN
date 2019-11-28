package com.ustglobal.jspwithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jspwithhibernate.dto.Product;
import com.ustglobal.jspwithhibernate.onetoone.Person;
import com.ustglobal.jspwithhibernate.onetoone.Votercard;

public class TestOnetoOne {


	public static void main(String[] args) {
		Votercard vc = new Votercard();
		vc.setVid(10);
		vc.setVname("Amala");
	
		
		Person  p = new Person();
		p.setPid(10);
		p.setPname("Amala");
		p.setVCard(vc);


		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Votercard v = entityManager.find(Votercard.class, 10);
			
			System.out.println(v.getPerson().getPid());
//			entityManager.persist(p);
//			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}


