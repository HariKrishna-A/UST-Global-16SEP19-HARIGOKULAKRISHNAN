package com.ustglobal.jspwithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jspwithhibernate.dto.Product;

public class ReadDemo {


	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product productDetails = entityManager.find(Product.class, 101);
		System.out.println("ID : "+productDetails.getPid());
		System.out.println("NAME : "+productDetails.getPname());
		System.out.println("QUANTITY : "+productDetails.getQuantity());
		entityManager.close();
	}

}
