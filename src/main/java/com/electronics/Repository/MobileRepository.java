package com.electronics.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.electronics.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile,Integer>{
	
	@Query(value = "select * from Mobile_details where brand like ?", nativeQuery = true)
	List<Mobile> getbybrand(String b);



	
	

	

	

}
