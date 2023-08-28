package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{

	@Query(value="select * from Car where owners like :s%",nativeQuery = true)
	public  List<Car> get(@Param("s") int owners);
	@Query(value="select * from Car where address =:sn%",nativeQuery = true)
	public  List<Car> get1(@Param("sn") String address);
	@Query(value="select * from Car where car_name like %:nn ",nativeQuery = true)
	public  List<Car> get2(@Param("nn") String carName);
	@Query(value="select * from Car where owners =:sa and car_type=:sd",nativeQuery = true)
	public  List<Car> get3(@Param("sa") int owners,@Param("sd") String carType);
	
}
