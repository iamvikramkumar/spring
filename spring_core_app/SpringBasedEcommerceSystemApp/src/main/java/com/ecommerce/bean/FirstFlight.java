package com.ecommerce.bean;

import org.springframework.stereotype.Component;

@Component("ff")
public class FirstFlight implements ICourierService {

	public void deliverOrder(String address) {
		System.out.println("delivered at " + address + " by FirstFlight ");
	}

}
