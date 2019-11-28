package com.ustglobal.jspwithhibernate.jbql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jspwithhibernate.dto.Product;

public class ReadNameDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "select Pname from Product";
		Query query = entityManager.createQuery(jpql);
		
		List<String> l =  query.getResultList();

		for (String string : l) {
			System.out.println(string);
		}
		entityManager.close();
	}

}
