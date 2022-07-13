package com.amitkr25.springdemo;

public class LoLCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public LoLCoach(FortuneService fs) {
		fortuneService = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "Make sure your creep score is at least 8-9 per minute.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
