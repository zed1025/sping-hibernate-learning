package com.amitkr25.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivity2Demo {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		SupportCoach theCoach = context.getBean("mySupportCoach", SupportCoach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();

	}

}
