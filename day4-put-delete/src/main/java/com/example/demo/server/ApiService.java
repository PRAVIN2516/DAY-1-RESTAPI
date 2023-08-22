package com.example.demo.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class ApiService {
 @Autowired
 StudentRepo sr;
 
 public Student savedetails(Student s) {
	 return sr.save(s);
 }
 public List<Student> showdata() {
	 return sr.findAll();
 }
 public Student changeinfo(Student s) {
		return sr.saveAndFlush(s);
	}
	
	public void deleteinfo(Student ss) {
		sr.delete(ss);
	}
}
