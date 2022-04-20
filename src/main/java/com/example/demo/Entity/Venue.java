package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class Venue {
	@Id
	@GeneratedValue(
	    strategy= GenerationType.AUTO,
	    generator="native"
	)
	@GenericGenerator(
	    name = "native",
	    strategy = "native"
	)
	private int venueId;
	private String venueName;
	private String venueImage;
	private String location;
	private int capacity;
	private String description;
	public Venue() {
		super();
	}
	public Venue(int venueId, String venueName, String venueImage, String location, int capacity, String description) {
		super();
		this.venueId = venueId;
		this.venueName = venueName;
		this.venueImage = venueImage;
		this.location = location;
		this.capacity = capacity;
		this.description = description;
	}
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public String getVenueImage() {
		return venueImage;
	}
	public void setVenueImage(String venueImage) {
		this.venueImage = venueImage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
