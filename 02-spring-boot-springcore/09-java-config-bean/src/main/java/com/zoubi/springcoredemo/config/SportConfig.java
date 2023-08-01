package com.zoubi.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zoubi.springcoredemo.common.Coach;
import com.zoubi.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {
	
	//define swimcoach as a bean (since it does not have the "component annotation
	//and give it id of "aquatic". Can call the id directly
	@Bean("aquatic")
	public Coach swimCoach() {
		return new SwimCoach();
	}

}
