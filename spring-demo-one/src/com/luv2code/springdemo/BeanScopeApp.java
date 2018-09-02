package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		//Loading Spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
				//retrive the bean from the container
				Coach theCoach = context.getBean("myCoach", Coach.class);
				Coach anotherCoach = context.getBean("myCoach", Coach.class);
				
				//check if they are same
				
				boolean result = (theCoach == anotherCoach);
				
				//printing beans 
				System.out.println("\n pointing to the same result \n " + result);
				
				System.out.println("\n memory location for theCoach" + theCoach);
				System.out.println("\n memorty location for anotherCoach" + anotherCoach);
				
				context.close();
	}

}
