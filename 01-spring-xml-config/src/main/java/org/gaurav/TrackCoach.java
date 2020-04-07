package org.gaurav;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Do a hard 5K!";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
