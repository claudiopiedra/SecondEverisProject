package com.everis.project.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.project.model.Subject;
import com.everis.project.service.SubjectService;

@RestController
@RequestMapping(value="subject")
public class SubjectRestController {

	@Autowired
	private SubjectService subjectService;
	
	@GetMapping("/get")
	public List<Subject> getSubject(){
		return subjectService.findAll();
	}
	
	@PostMapping("/post")
	public Subject insertSubject(@Valid @RequestBody Subject subject){
		return subjectService.saveSubject(subject);
	}
		
	@PutMapping("/put")
	public Subject updateSubject(@Valid @RequestBody Subject subject){
			return subjectService.updateSubject(subject);
	}
		
	@DeleteMapping("/delete/{subjectid}")
	public void deleteSubject(@PathVariable(name= "subjectid") Integer subjectid) {
		subjectService.deleteSubject(subjectid);
	}
}
