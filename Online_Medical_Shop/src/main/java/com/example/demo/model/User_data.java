package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserDatabase")
public class User_data {
@Id
private Integer id;
private String Name;
private String email;
private String password;
private Long PhoneNo;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Long getPhoneNo() {
	return PhoneNo;
}
public void setPhoneNo(Long phoneNo) {
	PhoneNo = phoneNo;
}
public User_data(Integer id, String name, String email, String password, Long phoneNo) {
	super();
	this.id = id;
	Name = name;
	this.email = email;
	this.password = password;
	PhoneNo = phoneNo;
}
public User_data() {
	super();
	// TODO Auto-generated constructor stub
}
}
