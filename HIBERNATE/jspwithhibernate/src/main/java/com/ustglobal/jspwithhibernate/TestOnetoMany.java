package com.ustglobal.jspwithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jspwithhibernate.dto.Product;
import com.ustglobal.jspwithhibernate.onetomany.Pencil;
import com.ustglobal.jspwithhibernate.onetomany.PencilBox;

public class TestOnetoMany {

	public static void main(String[] args) {
		
		PencilBox box = new PencilBox();
		box.setBid(2);
		box.setBname("Apsara");
		
		Pencil pencil = new Pencil();
		pencil.setPid(13);
		pencil.setColor("Black");
		pencil.setPBox(box);

		Pencil pencil1 = new Pencil();
		pencil1.setPid(14);
		pencil1.setColor("Blue");
		pencil1.setPBox(box);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
