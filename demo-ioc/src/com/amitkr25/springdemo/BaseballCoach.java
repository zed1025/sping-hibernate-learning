package com.amitkr25.springdemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30min on batting practise.";
	}
	
}
