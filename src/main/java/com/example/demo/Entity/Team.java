package com.example.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class Team {
	@Id
	@GeneratedValue(
	    strategy= GenerationType.AUTO,
	    generator="native"
	)
	@GenericGenerator(
	    name = "native",
	    strategy = "native"
	)
	private int teamId;
	@NotEmpty(message = "Team Name must not be Null/Empty")
	private String teamName;
	@NotEmpty(message= "Team Location must not be Null/Empty")
	private String teamLocation;
	@Min(10)
	private int teamSize;
	@NotEmpty(message="Team Image must not be Null/Empty")
	private String teamImage;
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamLocation() {
		return teamLocation;
	}
	public void setTeamLocation(String teamLocation) {
		this.teamLocation = teamLocation;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getTeamImage() {
		return teamImage;
	}
	public void setTeamImage(String teamImage) {
		this.teamImage = teamImage;
	}
	public Team(int teamId, String teamName, String teamLocation, int teamSize, String teamImage) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamLocation = teamLocation;
		this.teamSize = teamSize;
		this.teamImage = teamImage;
	}
	public Team() {
		super();
	}
	
}
