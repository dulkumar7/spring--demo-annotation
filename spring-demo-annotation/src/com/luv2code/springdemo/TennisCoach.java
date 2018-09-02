package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String dailyWorkout() {
		
		return "practic back hand valley";
	}

}
