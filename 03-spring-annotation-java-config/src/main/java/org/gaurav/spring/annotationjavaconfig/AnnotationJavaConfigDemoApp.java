package org.gaurav.spring.annotationjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		
		context.close();
	}

}
