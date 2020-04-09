package org.gaurav.spring.annotationjavaconfig;

public class SadFortuneService implements FortuneService {

	public String getDailyFortune() {
		return "Today is a sad day!";
	}

}
