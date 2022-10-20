package com.Insurance.LICInsurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientinsurance")
public class InsuranceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int client_id;
	private String client_name;
	private int insurance_amount;

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public int getInsurance_amount() {
		return insurance_amount;
	}

	public void setInsurance_amount(int insurance_amount) {
		this.insurance_amount = insurance_amount;
	}

}
