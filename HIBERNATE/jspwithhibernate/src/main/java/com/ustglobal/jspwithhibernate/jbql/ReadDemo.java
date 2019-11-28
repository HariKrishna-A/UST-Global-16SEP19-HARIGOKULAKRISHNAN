package com.ustglobal.jspwithhibernate.jbql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jspwithhibernate.dto.Product;

public class ReadDemo {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "from Product";
		Query query = entityManager.createQuery(jpql);
		
		List<Product> l =  query.getResultList();
		for (Product product : l) {
			System.out.println("ID :"+product.getPid());
			System.out.println("NAME :"+product.getPname());
			System.out.println("QUANTITY :"+product.getQuantity());
			System.out.println("--------------------------------------");
		}
		entityManager.close();
	}

}
