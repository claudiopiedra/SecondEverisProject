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
@RequestMapping(value="studentclass")
public class StudentClassRestController {

	@Autowired
	private StudentClassService studentClassService;
	
	@GetMapping(value= "getStudent")
	public List<StudentClass> getStudentClass(){
		return studentClassService.findAll();
	}
	
	@GetMapping("/getid/{studentid}")
	public StudentClass findByStudentid(@PathVariable("studentid") Integer studentid){
		return studentClassService.findByStudentid(studentid);
	}
	
	@PostMapping(value="postStudent")
	public StudentClass insertStudentClass(@RequestBody StudentClass studentclass){
		return studentClassService.saveStudentClass(studentclass);
	}
		
	@PutMapping(value= "putStudent")
	public StudentClass updateStudentClass(@RequestBody StudentClass studentclass){
			return studentClassService.updateStudentClass(studentclass);
	}
		
	@DeleteMapping("/deleteStudent/{studentid}")
	public void deleteStudentClass(@PathVariable(name= "studentid") Integer studentid) {
		studentClassService.deleteStudentClass(studentid);
	}
	
}
