package com.amitkr25.springdemo;

public class RandomFortuneService implements FortuneService {
	private String listFortunes[] = {"Before you leave, the fortune teller reminds you that the future is never set in stone.", 
			"Being the soothsayer of the tribe is a dirty job, but someone has to do it.", 
			"Life-ahead is timeless fortune."};

	@Override
	public String getFortune() {
		int min=0, max=2;
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Random Number generated: " + b); 
		return listFortunes[b];
	}

}
