package com.senseOfCode.springDemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		Coach theCoach=new BaseBallCoach();
		//create the track object
		Coach trackCoach=new TrackCoach();
		//use it
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyWorkout());

	}

}
