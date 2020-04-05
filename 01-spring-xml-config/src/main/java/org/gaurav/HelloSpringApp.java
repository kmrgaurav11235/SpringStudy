package org.gaurav;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// Get the context: Load the Configuration file
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// Retrieve beans from context (Spring Container)
		Coach theCoach = classPathXmlApplicationContext.getBean("theCoach", Coach.class);

		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// Close the context
		classPathXmlApplicationContext.close();
	}

}
