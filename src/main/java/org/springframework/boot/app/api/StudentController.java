package org.springframework.boot.app.api;

import java.util.List;

import javax.servlet.ServletException;

import org.springframework.boot.app.entities.StudentEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public StudentEntity getStudent() throws ServletException {
		
		return null;
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public void setStudent(StudentEntity student) throws ServletException {
		
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.DELETE)
	public void deleteStudent(StudentEntity student) throws ServletException {
		
	}
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<StudentEntity> getAllStudents() throws ServletException {
		
		return null;
	}
	
	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public void setStudents(List<StudentEntity> lStudent) throws ServletException {
		
	}
	
	@RequestMapping(value = "/students", method = RequestMethod.DELETE)
	public void deleteStudents(List<StudentEntity> lStudent) throws ServletException {
		
	}
	
	
	
}
