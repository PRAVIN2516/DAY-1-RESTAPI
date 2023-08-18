package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.module.Question_modle;

@RestController
public class Question_1 {
	@Value("${bas.var1}")
	public String name;
	@Value("${bas.var2}")
	public String name2;
@GetMapping("value")
public List<Question_modle> name() {
	return Arrays.asList(new Question_modle(name),new Question_modle("Ram"),new Question_modle(name2));
}
}
