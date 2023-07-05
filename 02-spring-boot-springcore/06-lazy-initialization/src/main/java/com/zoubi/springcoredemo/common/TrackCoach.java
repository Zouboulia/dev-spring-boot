package com.zoubi.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
// @Primary //since there are multiple implementations of Coach, make trackCoach the primary coach, no use of @Qualifier
public class TrackCoach implements Coach{
	
	public TrackCoach() {
		System.out.println("In constructor " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

}
