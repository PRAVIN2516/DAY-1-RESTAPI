package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question_1 {
@GetMapping("welcome")
public String Display() {
	return "Welcome to springboot";
}
}
