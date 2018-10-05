package org.springframework.boot.app.api;

import javax.servlet.ServletException;

import org.springframework.boot.app.entities.ToyEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToyController {

	@RequestMapping(value = "/toys", method = RequestMethod.GET)
	public ToyEntity getToy() throws ServletException {
		
		return null;
	}
	
	@RequestMapping(value = "/toys", method = RequestMethod.POST)
	public void setToy(ToyEntity toy) throws ServletException {
		
	}
	
	@RequestMapping(value = "/toys", method = RequestMethod.DELETE)
	public void deleteToy(ToyEntity toy) throws ServletException {

	}
}
