package com.vehicleagent.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleAgent {

	@Autowired
	private Bike bike;

	@Autowired
	private Car car;

	@Autowired
	private Bus bus;

	public IVehicle  getVehicle(String vehicleName) {
		
		if(vehicleName.equalsIgnoreCase("bike")) {
			return bike;
		}else if(vehicleName.equalsIgnoreCase("car")){
			return car;
		}else if(vehicleName.equalsIgnoreCase("bus")) {
			return bus;
		}
		
		return null;
	}

}
