package com.microservices.microservices;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

public class CurrencyExchangeSampleController {
	

	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}") // where {from} and {to} represents
																						// the
	// column
	// return a bean back
	public CurrencyConversionSampleBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		// setting variables to currency exchange service
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);

		// calling the currency-exchange-service
		ResponseEntity<CurrencyConversionSampleBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionSampleBean.class,
				uriVariables);
		CurrencyConversionSampleBean response = responseEntity.getBody();
		// creating a new response bean and getting the response back and taking it into
		// Bean

		return new CurrencyConversionSampleBean(1L, from, to, BigDecimal.ONE, quantity, quantity, 0);
	}
}
