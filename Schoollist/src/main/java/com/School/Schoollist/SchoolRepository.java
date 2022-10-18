package com.School.Schoollist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SchoolRepository extends JpaRepository<SchoolEntity, Integer> {
	
}
