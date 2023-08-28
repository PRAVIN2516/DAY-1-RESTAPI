package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.Apiservice;

@RestController
public class Apicontroller {

	@Autowired
	Apiservice as;
	 @PostMapping("insert")
	 public Car post(@RequestBody Car c) {
		 return as.insert(c);
	 }
	 @GetMapping("show")
	 public List<Car> get(){
		 return as.show();
      }
	 @GetMapping("owner/{c}")
	 public List<Car> like(@PathVariable int c){
		 return as.show1(c);
      }
	 @GetMapping("address/{c}")
	 public List<Car> like1(@PathVariable String c){
		 return as.show2(c);
      }
	 @GetMapping("carname/{c}")
	 public List<Car> like2(@PathVariable String c){
		 return as.show3(c);
      }
	 @GetMapping("owners/{c}/cartype/{s}")
	 public List<Car> like3(@PathVariable int c,@PathVariable String s){
		 return as.show4(c, s);
      }
}
