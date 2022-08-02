package com.senseOfCode.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoachc=context.getBean("myCoach",Coach.class);//can throw beanNotOfRequiredTypeException
		//Coach theCoachc=(Coach) context.getBean("myCoach");//can throw class cast exception
		// call methods on the bean
		System.out.println(theCoachc.getDailyWorkout());
		System.out.println(theCoachc.getDailyFortune());
		//close the context
		context.close();
		

	}

}
