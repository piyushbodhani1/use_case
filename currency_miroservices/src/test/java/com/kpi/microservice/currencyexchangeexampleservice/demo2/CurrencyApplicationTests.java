package com.kpi.microservice.currencyexchangeexampleservice.demo2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CurrencyApplicationTests {
  // First Run the Application and then check for test Cases
	@Test
	void contextLoads() {

		CurrencyConversionController obj = new CurrencyConversionController();
		long id = obj.c_id("USD", "INR", 1);
		int port_check = obj.port_c("USD", "INR", 2);
		int currency_diffrence = obj. curr_diff("USD", "INR", 2);
		
		assertEquals(id, 10001);
		assertEquals(currency_diffrence, 65);
		assertEquals(port_check, 8080);
	}

}
