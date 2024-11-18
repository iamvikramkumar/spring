package com.vehicleagent.beans;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements IVehicle {

	public void start() {

		System.out.println("Car started");

	}

	public void travel(String from, String to) {

		System.out.println("travelling from :" + from + "  to :" + to);
	}

	public void stop() {

		System.out.println("Car stopped");

	}

}
