package org.gaurav.spring.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	// Field Injection
	@Autowired
	@Qualifier("happyFortuneService")
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
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
}
