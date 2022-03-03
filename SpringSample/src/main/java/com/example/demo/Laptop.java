package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Laptop {
	
	private int id;
	private String name;
	private String brand;
	
	@Autowired
	private Hardisk hardisk;
	
	
	public Laptop() {
		super();
		System.out.println("Laptop Constructor is called..");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return brand;
	}
	public void setTech(String tech) {
		this.brand = tech;
	}
	
	public void switchON() {
		System.out.println("Laptop.switchON()");
		hardisk.write();
	}

}
