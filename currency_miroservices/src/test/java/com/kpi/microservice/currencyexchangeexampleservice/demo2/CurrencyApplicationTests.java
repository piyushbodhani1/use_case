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
		
		CurrencyConversionSampleBean ans = obj.convertCurrency("USD","INR", 70);
		
		int quantity = ans.getQuantity();
		assertEquals(quantity, 70);
		String from = ans.getFrom();
		assertEquals(from, "USD");
		String to = ans.getTo();
		assertEquals(to, "INR");
		

	}

}
