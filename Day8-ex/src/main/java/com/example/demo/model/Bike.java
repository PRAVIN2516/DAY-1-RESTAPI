package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {

	@Id
	private Integer bikeid;
	private String regnumber;
	private String ownername;
	private Integer year;
	private String bikename;
	private String modelname;
	public Integer getBikeid() {
		return bikeid;
	}
	public void setBikeid(Integer bikeid) {
		this.bikeid = bikeid;
	}
	public String getRegnumber() {
		return regnumber;
	}
	public void setRegnumber(String regnumber) {
		this.regnumber = regnumber;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public Bike(Integer bikeid, String regnumber, String ownername, Integer year, String bikename, String modelname) {
		super();
		this.bikeid = bikeid;
		this.regnumber = regnumber;
		this.ownername = ownername;
		this.year = year;
		this.bikename = bikename;
		this.modelname = modelname;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
