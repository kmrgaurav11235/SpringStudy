package org.gaurav;

public class MMACoach implements Coach {
	
	private FortuneService fortuneService;
	
	public MMACoach() {
		super();
	}

	public MMACoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 min doing pad work.";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
