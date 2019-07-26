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

import com.everis.project.model.Classes;
import com.everis.project.service.ClassService;

@RestController
@RequestMapping("/classes")
public class ClassRestController {

	@Autowired
	private ClassService classService;
	
	@GetMapping("/get")
	public List<Classes> getClasses(){
		return classService.findAll();
	}
	
	@PostMapping("/post")
	public Classes insertClasses(@Valid @RequestBody Classes classes){
		return classService.saveClasses(classes);
	}
		
	@PutMapping("/put")
	public Classes updateClasses(@Valid @RequestBody Classes classes){
			return classService.updateClasses(classes);
	}
		
	@DeleteMapping("/delete/{classid}")
	public void deleteClasses(@PathVariable(name= "classid") Integer classid) {
		classService.deleteClasses(classid);
	}
}
