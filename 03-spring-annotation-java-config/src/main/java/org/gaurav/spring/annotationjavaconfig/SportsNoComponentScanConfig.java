package org.gaurav.spring.annotationjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
public class SportsNoComponentScanConfig {
	
	// The name of the method is the bean-id
	@Bean
	public FortuneService fortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public SwimCoach swimCoach() {
		return new SwimCoach(fortuneService());
	}
}
