package com.example.demo.Entity;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class Event {
	@Id
	@GeneratedValue(
	    strategy= GenerationType.AUTO,
	    generator="native"
	)
	@GenericGenerator(
	    name = "native",
	    strategy = "native"
	)
	private int eventId;
	private String organizerEmail;
	private LocalDate eventDate;
	//TODO
	private int venueId;
	private String organizerName;
	private String organizerMobileNo;
	private String organizerAddress;
	private int vistorCount;
	//TODO
	private int teamId_A;
	//TODO
	private int teamId_B;
	private LocalDateTime eventTime;
	//TODO
	private int refreeId;
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getOrganizerEmail() {
		return organizerEmail;
	}
	public void setOrganizerEmail(String organizerEmail) {
		this.organizerEmail = organizerEmail;
	}
	public LocalDate getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	public String getOrganizerName() {
		return organizerName;
	}
	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}
	public String getOrganizerMobileNo() {
		return organizerMobileNo;
	}
	public void setOrganizerMobileNo(String organizerMobileNo) {
		this.organizerMobileNo = organizerMobileNo;
	}
	public String getOrganizerAddress() {
		return organizerAddress;
	}
	public void setOrganizerAddress(String organizerAddress) {
		this.organizerAddress = organizerAddress;
	}
	public int getVistorCount() {
		return vistorCount;
	}
	public void setVistorCount(int vistorCount) {
		this.vistorCount = vistorCount;
	}
	public int getTeamId_A() {
		return teamId_A;
	}
	public void setTeamId_A(int teamId_A) {
		this.teamId_A = teamId_A;
	}
	public int getTeamId_B() {
		return teamId_B;
	}
	public void setTeamId_B(int teamId_B) {
		this.teamId_B = teamId_B;
	}
	public LocalDateTime getEventTime() {
		return eventTime;
	}
	public void setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}
	public int getRefreeId() {
		return refreeId;
	}
	public void setRefreeId(int refreeId) {
		this.refreeId = refreeId;
	}
	public Event(int eventId, String organizerEmail, LocalDate eventDate, int venueId, String organizerName,
			String organizerMobileNo, String organizerAddress, int vistorCount, int teamId_A, int teamId_B,
			LocalDateTime eventTime, int refreeId) {
		super();
		this.eventId = eventId;
		this.organizerEmail = organizerEmail;
		this.eventDate = eventDate;
		this.venueId = venueId;
		this.organizerName = organizerName;
		this.organizerMobileNo = organizerMobileNo;
		this.organizerAddress = organizerAddress;
		this.vistorCount = vistorCount;
		this.teamId_A = teamId_A;
		this.teamId_B = teamId_B;
		this.eventTime = eventTime;
		this.refreeId = refreeId;
	}
	public Event() {
		super();
	}
	
	
}
