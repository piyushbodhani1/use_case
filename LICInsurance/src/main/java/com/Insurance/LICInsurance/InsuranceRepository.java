package com.Insurance.LICInsurance;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InsuranceRepository extends JpaRepository<InsuranceEntity, Integer> {

	@Query(value = "Select *  from clientinsurance where client_id = ?1", nativeQuery = true)
	List<InsuranceEntity> getInfo(Integer client_id);
	
	@Query(value = "Select *  from clientinsurance", nativeQuery = true)
	List<InsuranceEntity> getInfo1();

}
