package com.microservices.microservices;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepo extends JpaRepository<ExchangeValueEntity, Integer> {
	ExchangeValueEntity findByFromAndTo(String from, String to);
}
