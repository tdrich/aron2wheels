package com.ar2w.aron2wheels.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import com.ar2w.aron2wheels.model.Skill;

import com.ar2w.aron2wheels.model.Ride;

public class RideDaoImpl implements RideDao{
	
	private static String selectAllRides = 
			"SELECT title, distance, skill, link, tease " + 
			"FROM rides";
	
	private static String selectRideBySkillLength = 
			"SELECT title, distance, skill, link, tease " + 
			"FROM rides " + 
			"WHERE skill = ? " + 
			"AND distance = ? ";

	@Override
	public List<Ride> getRides() {
		List<Ride> myRides = new ArrayList<Ride>();
		ResultSet result = null;
		Statement statement = null;
		
		Connection conn = MariaDbUtil.getConnection();
		
		try {
			statement = conn.createStatement();
			result = statement.executeQuery(selectAllRides);
			myRides = makeRide(result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//result.close();
				statement.close();
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return myRides;
	}
	
	private List<Ride> makeRide(ResultSet result) throws SQLException {
		List<Ride> myRides = new ArrayList<Ride>();
		
		while(result.next()) {
			Ride ride = new Ride();
			
			
			ride.setName(result.getString("title"));
			ride.setLength(result.getString("distance"));
			String skillString = result.getString("skill");		
			ride.setSkill(Skill.convertStringToSkill(skillString));
			ride.setLink(result.getString("link"));
			ride.setTease(result.getString("tease"));
			
			myRides.add(ride);
		}
		return myRides;
		
	}
			

	@Override
	public List<Ride> getRidesBySkill(Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ride> getReport(Skill skill, String length) {
		List<Ride> myRides = new ArrayList<Ride>();
		ResultSet result = null;
		PreparedStatement ps = null;
		
		Connection conn = MariaDbUtil.getConnection();
		
		try {
			ps = conn.prepareStatement(selectRideBySkillLength);
			ps.setString(1, skill.toString());
			ps.setString(2, length);
			result = ps.executeQuery(); 
			myRides = makeRide(result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return myRides;
	}

}
