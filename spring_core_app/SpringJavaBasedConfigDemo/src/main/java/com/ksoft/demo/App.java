package com.ksoft.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ksoft.bean.Author;
import com.ksoft.bean.Book;
import com.ksoft.config.AppConfig;

public class App {
	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Author author = ac.getBean(Author.class);

		System.out.println("Author is:" + author.getName());

		List<Book> books = author.getBooks();

		for (Book b : books) {
			System.out.println(b.getIsbn() + " " + b.getName() + " " + b.getPrice());
		}

	}
}
