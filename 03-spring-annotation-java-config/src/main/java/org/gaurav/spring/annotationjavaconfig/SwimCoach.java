package org.gaurav.spring.annotationjavaconfig;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Swim 1000m as a warm-up.";
	}

	public String getFortune() {
		return fortuneService.getDailyFortune();
	}

}
