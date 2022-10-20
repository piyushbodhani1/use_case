package com.vehicle.Vehicles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "truck")
public class TruckEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int truck_id;
	private String truck_name;
	private int no_of_tyyer;

	public int getTruck_id() {
		return truck_id;
	}

	public void setTruck_id(int truck_id) {
		this.truck_id = truck_id;
	}

	public String getTruck_name() {
		return truck_name;
	}

	public void setTruck_name(String truck_name) {
		this.truck_name = truck_name;
	}

	public int getNo_of_tyyer() {
		return no_of_tyyer;
	}

	public void setNo_of_tyyer(int no_of_tyyer) {
		this.no_of_tyyer = no_of_tyyer;
	}
}
