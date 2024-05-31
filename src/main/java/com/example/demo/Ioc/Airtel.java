package com.example.demo.Ioc;

public class Airtel implements Sim {
	
	int sinNumber;

	public int getSinNumber() {
		return sinNumber;
	}

	public void setSinNumber(int sinNumber) {
		this.sinNumber = sinNumber;
	}

	//Constructor
	public Airtel() {
		System.out.println("Airtel Object created");
	}

	
	
	@Override
	public void calling() {
	      System.out.println("calling function in Airtel");
	}

	@Override
	public void data() {
		System.out.println("data function in Airtel");
		
	}

	
}
