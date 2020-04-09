package org.gaurav.spring.annotationjavaconfig;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.name}")
	private String name;
	
	@Value("${foo.email}")
	private String email;

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

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
