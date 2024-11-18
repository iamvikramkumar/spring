package com.vehicleagent.beans;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements IVehicle {

	public void start() {

		System.out.println("Bike started");

	}

	public void travel(String from, String to) {

		System.out.println("travelling from :" + from + "  to :" + to);
	}

	public void stop() {

		System.out.println("Bike stopped");

	}

}
