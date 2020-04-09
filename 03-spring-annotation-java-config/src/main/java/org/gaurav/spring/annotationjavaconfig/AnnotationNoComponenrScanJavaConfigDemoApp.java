package org.gaurav.spring.annotationjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationNoComponenrScanJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsNoComponentScanConfig.class);
		
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getEmail());		
		
		context.close();
	}

}
