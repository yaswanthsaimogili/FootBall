package com.example.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class User{
	@Id
	@GeneratedValue(
	    strategy= GenerationType.AUTO,
	    generator="native"
	)
	@GenericGenerator(
	    name = "native",
	    strategy = "native"
	)
	private int userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String password;
	private String gender;
	public int getUser_Id() {
		return userId;
	}
	public void setUser_Id(int user_Id) {
		this.userId = user_Id;
	}
	public String getFirst_Name() {
		return firstName;
	}
	public void setFirst_Name(String first_Name) {
		this.firstName = first_Name;
	}
	public String getLast_Name() {
		return lastName;
	}
	public void setLast_Name(String last_Name) {
		this.lastName = last_Name;
	}
	public String getPhone_Number() {
		return phoneNumber;
	}
	public void setPhone_Number(String phone_Number) {
		this.phoneNumber = phone_Number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User(int user_Id,String userName, String first_Name, String last_Name, String phone_Number, String email, String password,
			String gender) {
		super();
		this.userId = user_Id;
		this.userName=userName;
		this.firstName = first_Name;
		this.lastName = last_Name;
		this.phoneNumber = phone_Number;
		this.email = email;
		this.password = password;
		this.gender = gender;
	}
	public User() {
		super();
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}