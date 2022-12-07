package com.ar2w.aron2wheels.dao;

import java.util.ArrayList;
import java.util.List;


import com.ar2w.aron2wheels.model.Ride;
import com.ar2w.aron2wheels.model.Skill;

public class RideDaoMock implements RideDao{
	
	private static List<Ride> rides = new ArrayList<Ride>();
	
	static {
		Ride pjs = new Ride();
		pjs.setName("Petit Jean Short");
		pjs.setSkill(Skill.Beginner);
		pjs.setLength("Jaunt");
		
		Ride grit = new Ride();
		grit.setName("True Grit Trail");
		grit.setSkill(Skill.Beginner);
		grit.setLength("Ride");
		
		Ride long7 = new Ride();
		long7.setName("Scenic HWY 7");
		long7.setSkill(Skill.Expert);
		long7.setLength("Day Trip");
		
		Ride nebo = new Ride();
		nebo.setName("Nebo Climb");
		nebo.setSkill(Skill.Expert);
		nebo.setLength("Jaunt");
		
		Ride pjl = new Ride();
		pjl.setName("Petit Jean Long");
		pjl.setSkill(Skill.Intermediate);
		pjl.setLength("Ride");	
		
		Ride pigLoop = new Ride();
		pigLoop.setName("Pig Trail Loop");
		pigLoop.setSkill(Skill.Expert);
		pigLoop.setLength("Day Trip");
		
		Ride pigTrail = new Ride();
		pigTrail.setName("Pig Trail");
		pigTrail.setSkill(Skill.Expert);
		pigTrail.setLength("Ride");
		
		Ride ozark = new Ride();
		ozark.setName("Ozark loop");
		ozark.setSkill(Skill.Intermediate);
		ozark.setLength("Day Trip");
		
		Ride pushMtn = new Ride();
		pushMtn.setName("Push Mountain rd to Mountain View");
		pushMtn.setSkill(Skill.Intermediate);
		pushMtn.setLength("Jaunt");
		
		Ride us64 = new Ride();
		us64.setName("US Route 64");
		us64.setSkill(Skill.Beginner);
		us64.setLength("Day Trip");				
		
		rides.add(pjs);
		rides.add(grit);
		rides.add(long7);
		rides.add(nebo);
		rides.add(pjl);
		rides.add(pigLoop);
		rides.add(pigTrail);
		rides.add(ozark);
		rides.add(pushMtn);
		rides.add(us64);
		
		
	}

	@Override
	public List<Ride> getRides() {
		List<Ride> myRides = new ArrayList<Ride>();
		myRides.addAll(rides);
				
		return myRides;
	}

	@Override
	public List<Ride> getRidesBySkill(Skill skill) {
		List<Ride> myRides = new ArrayList<Ride>();
		for (Ride ride : rides) {
			if (ride.getSkill().equals(skill)) {
				myRides.add(ride);
			}
		}
		return myRides;
	}

	@Override
	public List<Ride> getReport(Skill skill, String length) {
		List<Ride> myRides = new ArrayList<Ride>();
		for (Ride ride : rides) {
			if (ride.getSkill().equals(skill)) {
				if (ride.getLength().equals(length)) {
					myRides.add(ride);
				}
			}
		}						
		return myRides;
	}
}


