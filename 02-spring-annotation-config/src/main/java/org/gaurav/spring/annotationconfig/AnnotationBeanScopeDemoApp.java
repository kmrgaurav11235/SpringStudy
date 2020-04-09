package org.gaurav.spring.annotationconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach firstCoach = context.getBean("tennisCoach", Coach.class);
		Coach secondCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean isSameBean = (firstCoach == secondCoach);
		
		System.out.println("Is firstCoach same as secondCoach: " + isSameBean);
		System.out.println("First Coach: " + firstCoach);
		System.out.println("Second Coach: " + secondCoach);
		
		context.close();
	}

}
