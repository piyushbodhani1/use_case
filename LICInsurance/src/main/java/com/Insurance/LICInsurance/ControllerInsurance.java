package com.Insurance.LICInsurance;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerInsurance {
	@Autowired
	private InsuranceRepository insurance1;
	@GetMapping("/details")
    public ArrayList<InsuranceEntity> getSample(){
    	    	
    	return (ArrayList<InsuranceEntity>) insurance1.getinfo(3);
    }
}
