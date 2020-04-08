package org.gaurav.spring.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;

	// Constructor Injection
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	public String getDailyWorkout() {
		return "Practice back-hand volley for 20 minutes.";
	}

	public String getFortune() {
		return fortuneService.getDailyFortune();
	}

	// Setter Injection
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	// Method Injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
