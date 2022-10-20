package com.vehicle.Vehicles;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerVehicle {
	@Autowired
	private CarRepository cr;
	@Autowired
	private BikeRepository bike;
	@Autowired
	private TruckRepository truck;

	@GetMapping("/c")
	public List<CarEntity> getSample() {
		
		return cr.getjoin();
	}
	@GetMapping("/t")

	public List<TruckEntity> getSample1() {
		
		return truck.getjoin();
	}
	@GetMapping("/b")
	public List<BikeEntity> getSample3() {
	   
		return bike.getjoin();
	}

}
