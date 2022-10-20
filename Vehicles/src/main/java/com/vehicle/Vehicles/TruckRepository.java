package com.vehicle.Vehicles;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<TruckEntity, Integer> {

	
	@Query(value = "select * from truck t  join  car c on t.no_of_tyyer = c.no_of_tyyer  join bike b on c.no_of_tyyer = b.no_of_tyyer group by t.truck_id order by t.truck_id",nativeQuery = true)
	public List<TruckEntity> getjoin();
}
