package com.ksoft.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ksoft.bean.Product;

public class App {
	public static void main(String[] args) {
		String configLocation = "src/main/resources/beanConfig.xml";
		ApplicationContext ac = new FileSystemXmlApplicationContext(configLocation);

		Product product = ac.getBean("po", Product.class);

		System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice());

		((AbstractApplicationContext) ac).registerShutdownHook();
		
	}
}