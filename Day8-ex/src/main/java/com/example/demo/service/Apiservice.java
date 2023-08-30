package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepo;

@Service
public class Apiservice {

	@Autowired
	BikeRepo br;
	
	public Bike insert(Bike b) {
		return br.save(b); 
	}
	public List<Bike> show(){
		return br.findAll();
		}
	
	public Bike showyear(Integer b) {
		return br.get(b);
	}
	public  Bike showyearname(Integer b,String s) {
		return br.gets(b, s);
	}
}
