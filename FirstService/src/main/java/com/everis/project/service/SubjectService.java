package com.everis.project.service;

import java.util.List;

import com.everis.project.model.Subject;

public interface SubjectService {
	
public List<Subject> findAll();
	
	public Subject saveSubject(Subject subject);
			
	public Subject updateSubject(Subject subject);
	
	public Subject findBySubjectid(int subjectid);
		
	public void deleteSubject(int subjectid);

}
