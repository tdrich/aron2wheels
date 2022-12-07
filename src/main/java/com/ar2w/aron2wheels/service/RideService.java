package com.ar2w.aron2wheels.service;

import java.util.List;

import com.ar2w.aron2wheels.dao.RideDao;
import com.ar2w.aron2wheels.dao.RideDaoImpl;
import com.ar2w.aron2wheels.dao.RideDaoMock;
import com.ar2w.aron2wheels.model.Ride;
import com.ar2w.aron2wheels.model.Skill;

public class RideService {
	
	//private RideDao rideDao = new RideDaoMock();
	private RideDao rideDao = new RideDaoImpl();
	
	public List<Ride> GetRides() {
		return rideDao.getRides();
	}

	public List<Ride> getRidesBySkill(Skill skill)	{
		return rideDao.getRidesBySkill(skill);
	}
	
	public List<Ride> getReport(Skill skill, String distance) {
		return rideDao.getReport(skill, distance);
	}
	
}
