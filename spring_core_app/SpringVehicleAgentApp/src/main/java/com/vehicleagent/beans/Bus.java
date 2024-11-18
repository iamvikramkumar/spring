package com.vehicleagent.beans;

import org.springframework.stereotype.Component;

@Component("bus")
public class Bus implements IVehicle {

	public void start() {

		System.out.println("Bus started");

	}

	public void travel(String from, String to) {

		System.out.println("travelling from :" + from + "  to :" + to);
	}

	public void stop() {

		System.out.println("Bus stopped");

	}

}
