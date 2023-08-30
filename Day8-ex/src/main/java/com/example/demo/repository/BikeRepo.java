package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Bike;

public interface BikeRepo extends JpaRepository<Bike, Integer>{

	@Query(value="select * from Bike where year=:s",nativeQuery = true)
	public Bike get(@Param("s") Integer year);
	@Query(value="select *from Bike where year=:sn and bikename=:bn",nativeQuery = true)
	public Bike gets(@Param("sn") Integer year,@Param("bn") String bikename);
}
