package com.ustglobal.jspwithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jspwithhibernate.manytomany.Course;
import com.ustglobal.jspwithhibernate.manytomany.Student;
import com.ustglobal.jspwithhibernate.onetomany.Pencil;
import com.ustglobal.jspwithhibernate.onetomany.PencilBox;

public class TestManytoMany {

	public static void main(String[] args) {


		Course course = new Course();
		course.setCid(100);
		course.setCname("JAVA");

		Course course1 = new Course();
		course1.setCid(200);
		course1.setCname("JS");

		

		ArrayList<Course> alCourses = new ArrayList<Course>();
		alCourses.add(course);
		alCourses.add(course1);
		
		Student student = new Student();
		student.setSid(1);
		student.setSname("Vishnu");
		student.setCourse(alCourses);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
