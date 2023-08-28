package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@Service
public class Apiservice {

	 @Autowired
	 CarRepo cr;
	 
	 public Car insert(Car c) {
		 return cr.save(c);
	 }
	 public List<Car> show(){
		 return cr.findAll();
      }
	 public List<Car> show1(int c){
		 return cr.get(c);
      }
	 public List<Car> show2(String c){
		 return cr.get1(c);
      }
	 public List<Car> show3(String c){
		 return cr.get2(c);
      }
	 public List<Car> show4(int c,String s){
		 return cr.get3(c, s);
      }
	 
}
