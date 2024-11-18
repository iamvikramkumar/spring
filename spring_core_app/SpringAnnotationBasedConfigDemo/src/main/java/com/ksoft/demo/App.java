package com.ksoft.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ksoft.bean.Account;
import com.ksoft.bean.Employ;

public class App {
	public static void main(String[] args) {

		/*
		 * String configLocation = "beanConfig.xml"; ClassPathXmlApplicationContext ac =
		 * new ClassPathXmlApplicationContext(configLocation);
		 * 
		 * Customer customer = ac.getBean(Customer.class);
		 * 
		 * System.out.println(customer.hashCode());
		 * 
		 * Customer customer2 = ac.getBean(Customer.class);
		 * System.out.println(customer2.hashCode());
		 * 
		 * System.out.println(customer);
		 * 
		 * ac.registerShutdownHook();
		 */

		String configLocation = "beanConfig.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);

		/*Employ employ = ac.getBean("emp", Employ.class);

		Account acnt = employ.getAccount();

		System.out.println(employ.getId() + " " + employ.getName());
		System.out.println("Account balance is:" + acnt.getBalance());
*/
		Account acnt2 = ac.getBean("acnt", Account.class);

		System.out.println(acnt2.getAccountNo() + " " + acnt2.getBalance()+" "+acnt2.getAccountType());

	}
}
