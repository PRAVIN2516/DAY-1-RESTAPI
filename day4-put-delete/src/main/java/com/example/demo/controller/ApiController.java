package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.server.ApiService;

@RestController
public class ApiController {
@Autowired
ApiService sser;

@PostMapping("enter")
public Student enter(@RequestBody Student s) {
	return sser.savedetails(s);
}
@GetMapping("see")
public List<Student> see(){
	return sser.showdata();
}
@PutMapping("update")
public Student update(@RequestBody Student s) {
	return sser.changeinfo(s);
}
@DeleteMapping("delete")
public String delete(@RequestBody Student s) {
	sser.deleteinfo(s);
	return "statement deleted";
}
}
