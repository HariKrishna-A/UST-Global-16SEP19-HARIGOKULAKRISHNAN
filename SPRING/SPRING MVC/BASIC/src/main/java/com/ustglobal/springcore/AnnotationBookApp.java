package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ConfigurationBookClass;
import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class AnnotationBookApp {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBookClass.class);
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getAuthor().getAname());
		System.out.println(book.getAuthor().getPenName());
		
		Book book2 = context.getBean(Book.class);
		System.out.println(book);
		System.out.println(book2);
		System.out.println("____________________");
		
//		Author author = context.getBean(Author.class);
//		System.out.println(author.getName());
//		System.out.println(author.getPenName());
		
		context.close();
		
	}

}
