package com.ar2w.aron2wheels.controller;

import java.util.List;


import com.ar2w.aron2wheels.model.Ride;
import com.ar2w.aron2wheels.model.Skill;
import com.ar2w.aron2wheels.service.RideService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/rides")
@Produces(MediaType.APPLICATION_JSON)
public class RideController {
	
	private RideService service = new RideService();
	
	@GET	
	public List<Ride> getRides() {
		
		return service.GetRides();		
	}
	
	@GET
	@Path("/skill/{skillValue}")
	public List<Ride> getRidesBySkill(@PathParam("skillValue") Skill skill)	{
		return service.getRidesBySkill(skill);
	}
	
	@GET
	@Path("/report")
	public List<Ride> getReport(
			@QueryParam("skill") Skill skill,
			@QueryParam("length") String length) {
		return service.getReport(skill, length);
		
	}
	
	

}
