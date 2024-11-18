package com.ksoft.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Customer {

	@Value("1234")
	private int id;
	@Value("Nithin")
	private String name;
	@Value("nithin@yahoo.com")
	private String email;
	@Value("7788559922")
	private long phone;
	@Value("vizag")
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ "]";
	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("performing post initialization operations");

	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("performing pre destroy operations");
	}

}
