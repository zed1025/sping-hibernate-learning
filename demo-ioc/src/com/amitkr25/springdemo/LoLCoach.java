package com.amitkr25.springdemo;

public class LoLCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Make sure your creep score is at least 8-9 per minute.";
	}

}
