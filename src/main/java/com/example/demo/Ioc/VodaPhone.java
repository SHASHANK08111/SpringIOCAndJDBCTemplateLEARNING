package com.example.demo.Ioc;

public class VodaPhone implements Sim {
	
	
	public VodaPhone() {
		System.out.println("VodaPhone Object created");
	}

	@Override
	public void calling() {
	      System.out.println("calling function in VodaPhone");
	}

	@Override
	public void data() {
		System.out.println("data function in VodaPhone");
		
	}
}
