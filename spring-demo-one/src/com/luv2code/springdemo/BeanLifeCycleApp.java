package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {

	public static void main(String[] args) {
		//Loading Spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
				
				//retrive the bean from the container
				Coach theCoach = context.getBean("myCoach", Coach.class);
				
				System.out.println(theCoach.getDailyWorkout());
				
				context.close();
	}

}
