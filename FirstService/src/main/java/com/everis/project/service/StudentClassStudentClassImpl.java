package com.everis.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.project.model.StudentClass;
import com.everis.project.repository.StudentClassRepository;

@Service
public class StudentClassStudentClassImpl implements StudentClassService{

	@Autowired
	private StudentClassRepository studentclassrepository;
	
	@Override
	public List<StudentClass> findAll() {
		return studentclassrepository.findAll();
	}

	@Override
	public StudentClass saveStudentClass(StudentClass studentclass) {
		return studentclassrepository.save(studentclass);
	}

	@Override
	public StudentClass updateStudentClass(StudentClass studentclass) {
		return studentclassrepository.saveAndFlush(studentclass);
	}

	@Override
	public StudentClass findByStudentid(int studentid) {
		return studentclassrepository.findById(studentid).get();
	}

	@Override
	public void deleteStudentClass(int studentid) {
		studentclassrepository.deleteById(studentid);
	}

}
