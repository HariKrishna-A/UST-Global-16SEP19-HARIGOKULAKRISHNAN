package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Book;

public class BookApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bookBeans.xml");
		
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getAuthor().getAname());
		System.out.println(book.getAuthor().getPenName());
//		System.out.println(book.getAuthor());
		context.close();
	}

}
