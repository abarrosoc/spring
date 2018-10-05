package org.springframework.boot.app.api;

import java.util.List;

import javax.servlet.ServletException;

import org.springframework.boot.app.entities.StudentEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	
	@RequestMapping( method = RequestMethod.GET)
	public List<StudentEntity> getAllStudents() throws ServletException {
		
		return null;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public StudentEntity getStudent() throws ServletException {
		
		return null;
	}
	
	@RequestMapping( method = RequestMethod.POST)
	public void setStudent(StudentEntity student) throws ServletException {
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStudent() throws ServletException {
		
	}

	
	
}
