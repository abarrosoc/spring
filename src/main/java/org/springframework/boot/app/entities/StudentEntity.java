package org.springframework.boot.app.entities;

import org.springframework.data.annotation.Id;

public class StudentEntity {
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private String c;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}

}
