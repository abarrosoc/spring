package org.springframework.boot.app.entities;

import org.springframework.boot.app.enums.Role;
import org.springframework.data.annotation.Id;

public class UserEntity {
	@Id
	private Long id;
	private String name;
	private String password;
	private Role role;
	
	public UserEntity(Long id, String name, String password, Role role){
		super();
		this.id=id;
		this.name=name;
		this.password=password;
		this.role=role;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
