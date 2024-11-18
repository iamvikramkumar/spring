package com.ecommerce.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ecommerce")
public class Ecommerce {

	@Autowired
	@Qualifier(value = "ff")
	private ICourierService courierService;

	public void placeOrder(String product, String address) {
		System.out.println("order placed for the requested product: " + product);
		courierService.deliverOrder(address);
	}

}
