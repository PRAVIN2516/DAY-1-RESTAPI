package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bike;
import com.example.demo.service.Apiservice;

@RestController
public class Apicontroller {

	@Autowired
	Apiservice as;
	@PostMapping("insert")
	public Bike inserts(@RequestBody Bike b) {
		return as.insert(b);
	}
	@GetMapping("show")
	public List<Bike> shows(){
		return as.show();
		}
	@GetMapping("year/{year}")
	public Bike showy(@PathVariable Integer year) {
		return as.showyear(year);
	}
	@GetMapping("year/{year}/bikename/{bikename}")
	public Bike showyn(@PathVariable Integer year,@PathVariable String bikename) {
		return as.showyearname(year, bikename);
	}
}
