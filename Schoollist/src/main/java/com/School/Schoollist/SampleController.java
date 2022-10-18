package com.School.Schoollist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
	private SchoolRepo er;

	@GetMapping("/schools")
	public List<SchoolEntity> getSample() {
		ArrayList<SchoolEntity> transformedvalues = new ArrayList<SchoolEntity>();
		for (SchoolEntity emt : er.findAll()) {
			SchoolEntity temp = new SchoolEntity();
            temp.setSchool_id(emt.getSchool_id());
			temp.setSchool_name(emt.getSchool_name());

			transformedvalues.add(temp);

		}
		return transformedvalues;
	}
   //task -> 17-October-2022 ->Assignment
	@GetMapping("/Schoolnamesorted")
	public List<String> getSample1(){
		ArrayList<String> list = new ArrayList<>();
		for(SchoolEntity emt : er.findAll()) {
			list.add(emt.getSchool_name());
		}
		Collections.sort(list);
		return list;
	}
    
}