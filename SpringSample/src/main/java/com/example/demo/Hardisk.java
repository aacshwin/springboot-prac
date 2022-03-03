package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Hardisk {
	
	private int id;
	private String brand;
	private int capacity;
	public Hardisk() {
		super();
		System.out.println("Hardisk constructor is called..");
	}
	
	public void write() {
		System.out.println("Hardisk.write()");
	}
	

}
