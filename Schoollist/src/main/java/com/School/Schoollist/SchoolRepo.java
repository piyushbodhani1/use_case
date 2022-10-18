package com.School.Schoollist;

//import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import net.bytebuddy.asm.Advice.OffsetMapping.Sort;
@Repository
public interface SchoolRepo  extends CrudRepository<SchoolEntity , Integer>{
//	@Query("FROM schoollist ORDER BY school_name ASC")
//    List<SchoolEntity> findAllOrderByPopulationAsc();
//
//    @Query("FROM City")
//    List<SchoolEntity> findAllOrderByNameAsc(Sort sort);
}
