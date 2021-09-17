package com.infy.demo1_graphql_simple;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@Column(name = "ID")
	private String id;
	@Column(name = "FIRST_NAME")
    private String firstName;
	@Column(name = "LAST_NAME")
    private String lastName;
	@Column(name = "JOB_DESCRIPTION")
	private int  jobLevel ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}
	
	

}
