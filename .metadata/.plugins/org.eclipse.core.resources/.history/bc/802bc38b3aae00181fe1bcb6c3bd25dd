package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {

		//Loading Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive the bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//Call the method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//Close the bean
		
		context.close();
	}

}
