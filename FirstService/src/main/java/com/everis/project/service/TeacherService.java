package com.everis.project.service;

import java.util.List;
import com.everis.project.model.Teacher;

public interface TeacherService {

	public List<Teacher> findAll();
	
	public Teacher saveTeacher(Teacher teacher);
			
	public Teacher updateTeacher(Teacher teacher);
	
	public Teacher findByTeacherid(int teacherid);
		
	public void deleteTeacher(int teacherid);
}
