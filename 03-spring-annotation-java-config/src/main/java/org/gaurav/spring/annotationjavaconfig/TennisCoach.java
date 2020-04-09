package org.gaurav.spring.annotationjavaconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public String getDailyWorkout() {
		return "Practice back-hand volley for 20 minutes.";
	}

	public String getFortune() {
		return fortuneService.getDailyFortune();
	}
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println(">> TennisCoach: Inside doMyStartUpStuff().");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> TennisCoach: Inside doMyCleanUpStuff().");
	}
}
