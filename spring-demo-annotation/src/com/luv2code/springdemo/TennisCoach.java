package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
	   }
	@PostConstruct
	public void doStartup() {
		System.out.println("startup");
	}

	
	/*@Autowired
	public void doSomethingCracy(FortuneService fortuneService) {
		System.out.println("dosomething");
		this.fortuneService = fortuneService;
	}*/


	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PreDestroy
	public void doCleanup() {
		System.out.println("doCleanup");
	}

}
