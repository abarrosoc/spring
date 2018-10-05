package org.springframework.boot.app.enums;

public enum Role {
	ADMIN("admin",1),
	USER("user",1);
	
	private String name;
	private int value;
	
	Role(String name,int value){
		this.name=name;
		this.value=value;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}
	
}	
