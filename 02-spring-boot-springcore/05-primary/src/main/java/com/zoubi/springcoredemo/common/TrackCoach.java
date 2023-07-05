package com.zoubi.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //since there are multiple implementations of Coach, make trackCoach the primary coach, no use of @Qualifier
public class TrackCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

}
