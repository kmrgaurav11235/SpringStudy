package org.gaurav;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach firstCoach = context.getBean("theCoach", Coach.class);
		Coach secondCoach = context.getBean("theCoach", Coach.class);
		
		boolean isSameBean = (firstCoach == secondCoach);
		
		System.out.println("Is same bean: " + isSameBean);
		System.out.println("First Coach: " + firstCoach);
		System.out.println("Second Coach: " + secondCoach);
		
		context.close();
	}

}
