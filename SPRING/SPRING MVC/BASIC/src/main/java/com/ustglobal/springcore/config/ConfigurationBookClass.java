package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;
@Configuration
public class ConfigurationBookClass {

	@Bean(name = "book")
	//@Scope("prototype")
	public Book getBook() {
		Book book = new Book();
		//book.setAuthor(getAuthor());  ////wireing
		book.setName("HP");
		book.setPrice(753951);
		return  book;
	}

	@Bean(name = "author")
	public Author getAuthor() {
		Author author = new Author();
		author.setAname("Gokul");
		author.setPenName("Flair");
		return author;
	}

	//	public Author getAuthor() {
	//		
	//	}
}
