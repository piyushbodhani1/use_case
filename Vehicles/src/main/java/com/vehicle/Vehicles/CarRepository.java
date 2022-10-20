package com.vehicle.Vehicles;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Integer>{

	
	@Query(value = "select * from truck t  join  car c on t.no_of_tyyer = c.no_of_tyyer  join bike b on c.no_of_tyyer = b.no_of_tyyer group by c.car_id order by c.car_id",nativeQuery = true)
	public List<CarEntity> getjoin();

	
	
}
