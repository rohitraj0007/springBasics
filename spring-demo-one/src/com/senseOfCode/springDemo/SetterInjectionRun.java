package com.senseOfCode.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionRun {
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext1.xml");
		
		//retrieve bean from spring container
		Coach theCoachc=context.getBean("myBaseBallCoach",Coach.class);//can throw beanNotOfRequiredTypeException
		//Coach theCoachc=(Coach) context.getBean("myCoach");//can throw class cast exception
		// call methods on the bean
		System.out.println(theCoachc.getDailyWorkout());
		System.out.println(theCoachc.getDailyFortune());
		//close the context
		context.close();
		

	}

}
