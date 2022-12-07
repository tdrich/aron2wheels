package com.ar2w.aron2wheels.model;

public enum RideClass {
	Beginner("Beginner"), Intermediate("Intermediate"), Expert("Expert"), Jaunt("Jaunt"), Ride("Ride"), DayTrip("Day Trip"), 
	Skill("Skill"), Length("Length");
	
private String rideClass;
	
	RideClass(String rideClass)
	{
		this.rideClass = rideClass;
	}
	
	public String toString()
	{		
		return rideClass;
	}

}
