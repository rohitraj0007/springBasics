package com.senseOfCode.springDemo;

public class BaseBallCoach implements Coach{
	
	
	//define a private field for the dependency
		private FortuneService fortuneService;
		private String team;
		private String email;
		
		//define a default constructor 
		public BaseBallCoach() {
			System.out.println("inside no arg constructor");
		}
		//create a setter method for injection
		public void setFortuneService (FortuneService fortuneService) {
			this.fortuneService = fortuneService;
		}
		
		public void setTeam(String team) {
			this.team = team;
		}
		
		public void setemail(String email) {
			this.email = email;
		}

@Override
public String getDailyWorkout() {
	return "spend 30 minutes on baseBall team: "+team +" "+ email;
}

@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return fortuneService.getFortune()+"setter injection";

}

}
