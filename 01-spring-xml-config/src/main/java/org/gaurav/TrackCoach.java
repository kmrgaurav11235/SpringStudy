package org.gaurav;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String name;
	
	private String emailAddress;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Do a hard 5K!";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
