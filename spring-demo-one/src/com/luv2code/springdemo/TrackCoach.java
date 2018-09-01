package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
