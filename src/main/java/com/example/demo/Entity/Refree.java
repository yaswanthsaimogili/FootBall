package com.example.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class Refree {
	@Id
	@GeneratedValue(
	    strategy= GenerationType.AUTO,
	    generator="native"
	)
	@GenericGenerator(
	    name = "native",
	    strategy = "native"
	)
	private int refreeId;
	@NotEmpty(message = "Refree Name must not be Null/Empty")
	private String refreeName;
	@NotEmpty(message= "Refree Location must not be Null/Empty")
	private String refreeLocation;
	@Min(0)
	private int refreeExperience;
	@NotEmpty(message="Refree Image must not be Null/Empty")
	private String refreeImage;
	public int getRefreeId() {
		return refreeId;
	}
	public void setRefreeId(int RefreeId) {
		this.refreeId = RefreeId;
	}
	public String getRefreeName() {
		return refreeName;
	}
	public void setRefreeName(String RefreeName) {
		this.refreeName = RefreeName;
	}
	public String getRefreeLocation() {
		return refreeLocation;
	}
	public void setRefreeLocation(String RefreeLocation) {
		this.refreeLocation = RefreeLocation;
	}
	public int getRefreeExperience() {
		return refreeExperience;
	}
	public void setRefreeExperience(int RefreeExperienece) {
		this.refreeExperience = RefreeExperienece;
	
	}
	public String getRefreeImage() {
		return refreeImage;
	}
	public void setRefreeImage(String RefreeImage) {
		this.refreeImage = RefreeImage;
	}
	public Refree(int RefreeId, String RefreeName, String RefreeLocation, int RefreeExperienece, String RefreeImage) {
		super();
		this.refreeId = RefreeId;
		this.refreeName = RefreeName;
		this.refreeLocation = RefreeLocation;
		this.refreeExperience = RefreeExperienece;
		this.refreeImage = RefreeImage;
	}
	public Refree() {
		super();
	}
	
}

