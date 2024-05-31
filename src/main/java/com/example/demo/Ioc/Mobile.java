package com.example.demo.Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
  
	public static void main(String[] args) {
//		Sim sim=new Airtel();
//		sim.calling();
//		sim.data();
//		
//		Sim sim1=new VodaPhone();
//		sim.calling();
//		sim.data();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
//		Airtel airtel= (Airtel) context.getBean("Airtel");
//		airtel.setSinNumber(123);
//		airtel.calling();
//		airtel.data();
//		
//		Airtel airtel1= context.getBean("Airtel",Airtel.class);
//		System.out.println(airtel1.getSinNumber());
		
//		VodaPhone vphone=context.getBean("vphone",VodaPhone.class);
//		vphone.calling();
//		vphone.data();
		
		Sim sim=context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		
	}
  
}
