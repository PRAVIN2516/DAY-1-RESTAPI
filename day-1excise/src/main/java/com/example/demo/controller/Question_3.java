package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question_3 {
@Value("${color}")
public String color;
@GetMapping("color")
public String Display() {
	return "My favorite color is "+color;
}
}
