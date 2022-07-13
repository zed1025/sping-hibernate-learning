package com.amitkr25.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	//new private fields for email and team for the coach
	private String emailAddress;
	private String team;
	
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setEmailAddress method!");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setTeam method!");
		this.team = team;
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
