package com.ecommerce.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ecommerce.bean.Ecommerce;
import com.ecommerce.config.AppConfig;

public class ClientApp {
	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Ecommerce e = ac.getBean("ecommerce", Ecommerce.class);

		e.placeOrder("Lenovo Lappy", "H.No: 2-25, Happy Homes PG, KPHB Phase-II, Hyd-500062");
		
		((AbstractApplicationContext) ac).registerShutdownHook();

	}
}
