package com.vehicleagent.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vehicleagent.beans.Bike;
import com.vehicleagent.beans.VehicleAgent;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		VehicleAgent agent = ac.getBean(VehicleAgent.class);

		Bike bike = (Bike) agent.getVehicle("bike");

		bike.start();
		bike.travel("Hyderabad", "Delhi");
		bike.stop();
	}
}
