package com.ustglobal.jsawithhibernatestd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jsawithhibernatestd.dto.Std;

public class ReadDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Std info = entityManager.find(Std.class, 111);
		System.out.println("ID : "+info.getId());
		System.out.println("NAME : "+info.getName());
		System.out.println("EMAIL : "+info.getEmail());
		entityManager.close();
	}

}
