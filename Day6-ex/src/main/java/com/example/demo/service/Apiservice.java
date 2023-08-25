package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Child;
import com.example.demo.repository.ChildRepo;

@Service
public class Apiservice {

	@Autowired
	ChildRepo cr;
	public Child post( Child c) {
		return cr.save(c);
	}
	public List<Child> get(){
		return cr.findAll();
	}
	public List<Child> order(String name){
		return cr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,name));
	}
	public List<Child> pagecontent(int pgno,int pgsize){
		Page<Child> p=cr.findAll(PageRequest.of(pgno,pgsize) );
		return p.getContent();
	}
}
