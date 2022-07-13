package com.amitkr25.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	//no-argument constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-argument constructor!");
	}
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	// this setter method will be called by spring during setter injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setFortuneService method!");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling for 15min daily.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
