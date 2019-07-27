package com.everis.project.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.project.model.Teacher;
import com.everis.project.service.TeacherService;

@RestController
@RequestMapping(value="teachers")
public class TeacherRestController {

	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/get")
	public List<Teacher> getTeacher(Model model){
		return teacherService.findAll();	 
	}
	
	@PostMapping("/post")
	public Teacher insertTeacher(@Valid @RequestBody Teacher teacher){
		return teacherService.saveTeacher(teacher);
	}
		
	@PutMapping("/put")
	public Teacher updateTeacher(@Valid @RequestBody Teacher teacher){
			return teacherService.updateTeacher(teacher);
	}
		
	@DeleteMapping("/delete/{teacherid}")
	public void deleteTeacher(@PathVariable(name= "teacherid") Integer teacherid) {
		teacherService.deleteTeacher(teacherid);
	}
}
