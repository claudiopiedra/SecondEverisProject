package com.everis.project.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.project.FirstServiceApplication;
import com.everis.project.model.Subject;
import com.everis.project.repository.ClassRepository;
import com.everis.project.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService{

	private static Logger logger = LoggerFactory.getLogger(FirstServiceApplication.class); 

	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Override
	public List<Subject> findAll() {
		return subjectRepository.findAll();
	}

	@Override
	public Subject saveSubject(Subject subject) {
		return subjectRepository.save(subject);
	}

	@Override
	public Subject updateSubject(Subject subject) {
		return subjectRepository.saveAndFlush(subject);
	}

	@Override
	public Subject findBySubjectid(int subjectid) {
		return subjectRepository.findById(subjectid).get();
	}

	@Override
	public void deleteSubject(int subjectid) {
		subjectRepository.deleteById(subjectid);
	}
	
	

}
