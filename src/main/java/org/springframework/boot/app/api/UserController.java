package org.springframework.boot.app.api;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import org.springframework.boot.app.entities.UserEntity;
import org.springframework.boot.app.enums.Role;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	
	@RequestMapping( method = RequestMethod.GET)
	public List<UserEntity> getAllUsers() throws ServletException {
		
		List<UserEntity> lUsers = new ArrayList<UserEntity>();
		
	    return lUsers;
	}
	@RequestMapping(method = RequestMethod.POST)
	public void setUser(UserEntity user) throws ServletException {
		
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserEntity getUser() throws ServletException {
		
		return null;
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteUser() throws ServletException {

	}

}
