package com.Employeee.EmpoyeeR;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author PiyushBodhani
 *
 */
@RestController

public class SampleController {
	@Autowired
	private EmployeeRepo er;//up to date
	@GetMapping("/employeename") 
	public  List<String> getsample(){
		ArrayList<String > name = new ArrayList<String>();
		for(EmployeeEntity emt:er.findAll()) {
			name.add(emt.getEmployee_name());
		}
		return name;
	}
	@GetMapping("/id") 
	public  List<Integer> getsample1(){
		ArrayList<Integer > id = new ArrayList<Integer>();
		for(EmployeeEntity emt:er.findAll()) {
			id.add(emt.getId());
		}
		return id;
	}
	@GetMapping("/employeename/A") 
	public List<String> getsample2(){
		ArrayList<String> st = new ArrayList<>();
		for(EmployeeEntity emt : er.findAll()) {
			if(emt.getEmployee_name().startsWith("A")) {
				st.add(emt.getEmployee_name());
			}
		}
		return st;
	}
	@GetMapping("/department") 
	public List<String> getsample3(){
		ArrayList<String> st = new ArrayList<>();
		for(EmployeeEntity emt : er.findAll()) {
			st.add(emt.getDepartment());
		}
		return st;
	}

}
