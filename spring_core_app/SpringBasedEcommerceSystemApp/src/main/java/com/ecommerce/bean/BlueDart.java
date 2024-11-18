package com.ecommerce.bean;

import org.springframework.stereotype.Component;

@Component("bd")
public class BlueDart implements ICourierService {

	public void deliverOrder(String address) {

		System.out.println("delivered at " + address + " by BlueDart ");
	}

}
