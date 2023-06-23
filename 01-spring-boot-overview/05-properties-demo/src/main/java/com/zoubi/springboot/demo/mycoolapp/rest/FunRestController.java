package com.zoubi.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class FunRestController {
	
	//inject properties for coach.name and team.name
	@Value("${coach.name}")
	public String coachName;
	
	@Value("${team.name}")
	public String teamName;
	
	//expose new endpoint for team info
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach name: " + coachName + "," + "Team name: " + teamName;
	}

	//expose "/" endpoint that returns "Hello World"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
	
	//expose new endpoint for "workout"	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a 5k!";
	}
	
	//expose a new endpoint for "fortune"
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day!";
	}
	
	
}


