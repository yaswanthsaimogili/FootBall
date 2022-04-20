package com.example.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class User_Role {
	@Id
	@GeneratedValue(
	    strategy= GenerationType.AUTO,
	    generator="native"
	)
	@GenericGenerator(
	    name = "native",
	    strategy = "native"
	)
	private int userRoleId;
	//TODO
	private	int userId;
	private String userRole;
	
	public int getUser_Role_id() {
		return userRoleId;
	}
	public void setUser_Role_id(int user_Role_id) {
		userRoleId = user_Role_id;
	}
	public int getUser_id() {
		return userId;
	}
	public void setUser_id(int user_id) {
		userId = user_id;
	}
	public String getUser_Role() {
		return userRole;
	}
	public void setUser_Role(String user_Role) {
		userRole = user_Role;
	}
	public User_Role(int user_Role_id, int user_id, String user_Role) {
		super();
		userRoleId = user_Role_id;
		userId = user_id;
		userRole = user_Role;
	}
	public User_Role() {
		super();
	}
	
	

}
