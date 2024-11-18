package com.ksoft.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// Greet obj = new Greet();

		ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/bean-config.xml");

		Object obj = ac.getBean("g");

		Greet greet = (Greet) obj;

		System.out.println(greet.getMessage());

	}
}
