package com.School.Schoollist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SchoollistApplicationTests {
	@Autowired
    private SchoolServices schoolService;

	@Test
	void contextLoads() {
		List<SchoolEntity> school = schoolService.list();

        assertEquals(school.size(), 5);
	}

}
