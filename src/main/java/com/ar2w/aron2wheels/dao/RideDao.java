package com.ar2w.aron2wheels.dao;

import java.util.List;

import com.ar2w.aron2wheels.model.Ride;
import com.ar2w.aron2wheels.model.Skill;

public interface RideDao {
	
	public List<Ride> getRides();
	public List<Ride> getRidesBySkill(Skill skill);
	public List<Ride> getReport(Skill skill, String length);

}
