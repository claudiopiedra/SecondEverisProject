package com.everis.project.service;

import java.util.List;
import com.everis.project.model.StudentClass;

public interface StudentClassService {

	public List<StudentClass> findAll();
	
	public StudentClass saveStudentClass(StudentClass studentclass);
			
	public StudentClass updateStudentClass(StudentClass studentclass);
	
	public StudentClass findByStudentid(int studentid);
		
	public void deleteStudentClass(int studentid);
	
}
