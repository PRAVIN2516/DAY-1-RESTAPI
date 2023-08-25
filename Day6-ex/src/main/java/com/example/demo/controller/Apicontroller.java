package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Child;
import com.example.demo.service.Apiservice;

@RestController
public class Apicontroller {
@Autowired
Apiservice as;

@PostMapping("insert")
public Child insert(@RequestBody Child c) {
	return as.post(c);
}
@GetMapping("show")
public List<Child> show() {
	return as.get();
	
}
@GetMapping("order/{babyFirstName}")
public List<Child> order(@PathVariable String babyFirstName){
	return as.order(babyFirstName);
}
@GetMapping("page/{pgno}/{pgsiz}")
public List<Child> paging(@PathVariable int pgno,@PathVariable int pgsiz){
	return as.pagecontent(pgno, pgsiz);
}
}
