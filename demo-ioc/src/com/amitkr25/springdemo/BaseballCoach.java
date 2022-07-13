package com.amitkr25.springdemo;

public class BaseballCoach implements Coach {
	//define a private field for dependency
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		
	}

	//constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30min on batting practise.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
