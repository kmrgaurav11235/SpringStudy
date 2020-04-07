package org.gaurav;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Spend an hour on the Batting crease.";
	}

	public String getDailyFortune() {
		return "Just do it! " + fortuneService.getDailyFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("Inside CricketCoach: doMyStartupStuff() method");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("Inside CricketCoach: doMyCleanupStuff() method");
	}

}
