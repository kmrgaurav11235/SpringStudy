package org.gaurav.spring.annotationjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationNoComponenrScanJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsNoComponentScanConfig.class);
		
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		
		context.close();
	}

}
