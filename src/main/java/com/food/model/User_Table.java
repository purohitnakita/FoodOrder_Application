package com.food.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User_Table {
	@Id
	private String user_name;
	private String email;
	private String address;
	private String role;
	private long ph_number;
	//private String password;

	@Override
	public String toString() {
		return "User_Table [ user_name=" + user_name + ", email=" + email + ", address="
				+ address + ", role=" + role + ", ph_number=" + ph_number + "]";
	}
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getPh_number() {
		return ph_number;
	}

	public void setPh_number(long ph_number) {
		this.ph_number = ph_number;
	}



}
