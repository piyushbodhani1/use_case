package com.microservices.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CurrencyExchangeSampleController {
	@Autowired
	private ExchangeValueRepo ev;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValueEntity convertCurrency(@PathVariable String from,@PathVariable String to)  
	{  
		return ev.findByFromAndTo(from, to);
		
	}  
}
