package com.School.Schoollist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public class ControllerSort {
	private SchoolRepo err;
	@GetMapping("/result")
	private List<String> sortData(List<String> list) {
		ArrayList<SchoolEntity> transformedvalues = new ArrayList<SchoolEntity>();
		ArrayList<String> name = new ArrayList<String>();
		for (SchoolEntity emt : err.findAll()) {
			SchoolEntity temp = new SchoolEntity();
			temp.setSchool_name(emt.getSchool_name());
			

			for (int i = 0; i < transformedvalues.size(); i++) {
				name.add(emt.getSchool_name());
			}

			Collections.sort(name);
		}
		return list;
	}
}
