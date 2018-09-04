package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// read spring config file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// get the bean from spring container
				Coach theCoach = context.getBean("tennisCoach", Coach.class);
				Coach myCoach = context.getBean("tennisCoach", Coach.class);
				
				boolean result = (theCoach == myCoach);
				
				//printing beans 
				System.out.println("\n pointing to the same result \n " + result);
				
				System.out.println("\n memory location for theCoach" + theCoach);
				System.out.println("\n memorty location for anotherCoach" + myCoach);
				
				context.close();

}
}
