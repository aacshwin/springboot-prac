package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpBean {
		
	@Id
	private String name;
	private String tech;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "EmpBean [Name=" + name + ", tech=" + tech + "]";
	}

}
