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
	//this will give all the details 
	@GetMapping("/details")
    public ArrayList<InsuranceEntity> getSample(){
    	    	
    	return (ArrayList<InsuranceEntity>) insurance1.getinfo1();
    }
	
	
	// this will give details as per id entered
	@GetMapping("/details/id={id}")
    public ArrayList<InsuranceEntity> getSample(@PathVariable("id") Integer id){
    	    	
    	return (ArrayList<InsuranceEntity>) insurance1.getinfo(id);
    }
}
