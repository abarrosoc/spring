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
public class UserController {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<UserEntity> getUser() throws ServletException {
		
		List<UserEntity> lUsers = new ArrayList<UserEntity>();
		
		lUsers.add(new UserEntity(1L,"Pepe","1234",Role.ADMIN));
		lUsers.add(new UserEntity(1L,"Juan","5678",Role.ADMIN));
		lUsers.add(new UserEntity(1L,"Luis","9123",Role.ADMIN));
		
	    return lUsers;
	}
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<UserEntity> getAllUsers() throws ServletException {
		
		List<UserEntity> lUsers = new ArrayList<UserEntity>();
		
		lUsers.add(new UserEntity(1L,"Pepe","1234",Role.ADMIN));
		lUsers.add(new UserEntity(1L,"Juan","5678",Role.ADMIN));
		lUsers.add(new UserEntity(1L,"Luis","9123",Role.ADMIN));
		
	    return lUsers;
	}
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public void setUser(UserEntity user) throws ServletException {
		
	}
	@RequestMapping(value = "/user", method = RequestMethod.DELETE)
	public void deleteUser(UserEntity user) throws ServletException {

	}

}
