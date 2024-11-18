package com.ecommerce.bean;

import org.springframework.stereotype.Component;

@Component("dc")
public class DTDC implements ICourierService {

	public void deliverOrder(String address) {

		System.out.println("delivered at " + address + " by DTDC ");

	}

}
