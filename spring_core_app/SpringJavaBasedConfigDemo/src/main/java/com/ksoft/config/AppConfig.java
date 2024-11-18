package com.ksoft.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ksoft.bean.Author;
import com.ksoft.bean.Book;

@Configuration
public class AppConfig {

	@Bean
	public Book book() {
		Book b1 = new Book();
		b1.setIsbn(1234);
		b1.setName("HeadFirst Java");
		b1.setPrice(750.25);
		b1.setAuthor("Kathy Sierra");
		return b1;
	}

	@Bean
	public Book book2() {
		Book b1 = new Book();
		b1.setIsbn(12345);
		b1.setName("HeadFirst Servlet");
		b1.setPrice(550.25);
		b1.setAuthor("Kathy Sierra");
		return b1;
	}

	@Bean
	public Book book3() {
		Book b1 = new Book();
		b1.setIsbn(123456);
		b1.setName("HeadFirst JSP");
		b1.setPrice(650.25);
		b1.setAuthor("Kathy Sierra");
		return b1;
	}

	@Bean
	public Author author() {

		List<Book> bookList = Arrays.asList(book(), book2(), book3());

		Author author = new Author();
		author.setId(100000001);
		author.setName("Kathy Sierra");
		author.setBooks(bookList);

		return author;
	}

}
