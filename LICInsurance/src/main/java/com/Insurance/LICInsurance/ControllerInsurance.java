package com.Insurance.LICInsurance;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerInsurance {
	@Autowired
	private InsuranceRepository insurance1;

	// this will give all the details
	@GetMapping("/details")
	public ArrayList<InsuranceEntity> getSample() {

		return (ArrayList<InsuranceEntity>) insurance1.getInfo1();
	}

	// this will give details as per id entered
	@GetMapping("/details/id={id}")
	public ArrayList<InsuranceEntity> getSample(@PathVariable("id") Integer id) {

		return (ArrayList<InsuranceEntity>) insurance1.getInfo(id);
	}

	// Class Requirements task ->21-October-2022

	@GetMapping("/client_discount/{ten}/{premium}")
	public int discount(@PathVariable String ten, @PathVariable int premium) {

		final String more = "morethanfive";
		final String equal = "equalfive";
		final int persent = 100;

		if (ten.equals(equal)) {
			return premium - ((10 * premium) / persent);

		} else if (ten.equals(more)) {
			return premium -  ((12 * premium) / persent);
		}
		return (premium);

	}
}
