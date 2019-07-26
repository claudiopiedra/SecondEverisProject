package com.everis.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.project.model.StudentClass;
import com.everis.project.service.StudentClassService;

@RestController
@RequestMapping("/studentclass")
public class StudentClassRestController {

	@Autowired
	private StudentClassService studentClassService;
	
	@GetMapping("/get")
	public List<StudentClass> getStudentClass(){
		return studentClassService.findAll();
	}
	
	@PostMapping("/post")
	public StudentClass insertStudentClass(@RequestBody StudentClass studentclass){
		return studentClassService.saveStudentClass(studentclass);
	}
		
	@PutMapping("/put")
	public StudentClass updateStudentClass(@RequestBody StudentClass studentclass){
			return studentClassService.updateStudentClass(studentclass);
	}
		
	@DeleteMapping("/delete/{studentid}")
	public void deleteStudentClass(@PathVariable(name= "studentid") Integer studentid) {
		studentClassService.deleteStudentClass(studentid);
	}
	
}
