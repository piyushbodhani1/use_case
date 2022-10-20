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
@Table(name = "bike")
public class BikeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@OneToMany(targetEntity = TruckEntity.class,cascade = CascadeType.ALL)
//	@JoinColumn(name="no_of_tyyers",referencedColumnName = "no_of_tyyer")
//	private List<TruckEntity> truck;
	private int bike_id;
	private String bike_name;
	private int no_of_tyyer;

	public int getBike_id() {
		return bike_id;
	}

	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}

	public String getBike_name() {
		return bike_name;
	}

	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}

	public int getNo_of_tyyer() {
		return no_of_tyyer;
	}

	public void setNo_of_tyyer(int no_of_tyyer) {
		this.no_of_tyyer = no_of_tyyer;
	}
}
