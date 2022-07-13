package com.amitkr25.springdemo;

public class SupportCoach implements Coach {
	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Best day to start is today, lets go!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
