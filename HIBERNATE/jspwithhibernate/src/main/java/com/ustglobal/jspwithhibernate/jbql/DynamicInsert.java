package com.ustglobal.jspwithhibernate.jbql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsert {

	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			String jpql = "insert into Product (Pid, Pname, quantity) values (:id, :name, :quantity)";
			Query query = entityManager.createNativeQuery(jpql);
			
			query.setParameter("id",100);
			query.setParameter("name","Book");
			query.setParameter("quantity",10);
			
			int count = query.executeUpdate();
		
			System.out.println(count);
			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		finally {
			entityManager.close();
		}
	}


}
