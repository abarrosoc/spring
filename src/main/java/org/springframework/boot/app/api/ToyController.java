package org.springframework.boot.app.api;

import java.util.List;

import javax.servlet.ServletException;

import org.springframework.boot.app.entities.ToyEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/toy")
public class ToyController {

	@RequestMapping(method = RequestMethod.GET)
	public List<ToyEntity> getAllToys() throws ServletException {
		
		return null;
	}
	
	@RequestMapping( method = RequestMethod.POST)
	public void setToy(ToyEntity toy) throws ServletException {
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ToyEntity getToy() throws ServletException {
		
		return null;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteToy() throws ServletException {

	}
}
