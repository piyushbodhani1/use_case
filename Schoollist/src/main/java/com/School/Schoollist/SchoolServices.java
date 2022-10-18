package com.School.Schoollist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

@Service
public class SchoolServices {
	@Autowired
	private SchoolRepository schoolRepository;

	public List<SchoolEntity> list() {
		return schoolRepository.findAll();
	}

}
