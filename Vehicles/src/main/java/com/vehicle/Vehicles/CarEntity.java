package com.vehicle.Vehicles;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class CarEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int car_id;
	private String car_name;
	private int no_of_tyyer;
//	@OneToMany(targetEntity = BikeEntity.class,cascade = CascadeType.ALL)
//	@JoinColumn(name="no_of_tyyers",referencedColumnName = "no_of_tyyer")
//	private List<BikeEntity> bikes;
                                                             
	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public int getNo_of_tyyer() {
		return no_of_tyyer;
	}

	public void setNo_of_tyyer(int no_of_tyyer) {
		this.no_of_tyyer = no_of_tyyer;
	}

}
