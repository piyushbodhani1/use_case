package com.Employeee.EmpoyeeR;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmpoyeeRApplicationTests {

	@Test
	void contextLoads() {
		SampleController s = new SampleController();
		List<String> list = s.getsample();
		String ans  = list.get(0);
		assertEquals(ans, "Abhitayu");
		
		
		
		 //assertEquals(Arrays.asList("Abhitayu","Madhav","om","Sagar", "Pravin"), s.getsample());
		
	}

}
