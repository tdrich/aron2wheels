package com.ar2w.aron2wheels.model;

public enum Skill {
	Beginner, Intermediate, Expert;
	
	public static Skill convertStringToSkill(String value) {
		Skill mySkill = null;
		
		for(Skill skill : Skill.values()) {
			if (skill.toString().equalsIgnoreCase(value)) {
				mySkill = skill;
				break;
			}
		}
		
		return mySkill;
	}

}
