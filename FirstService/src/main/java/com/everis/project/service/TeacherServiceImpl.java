package com.everis.project.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.project.FirstServiceApplication;
import com.everis.project.model.Teacher;
import com.everis.project.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

	private static Logger logger = LoggerFactory.getLogger(FirstServiceApplication.class); 
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public List<Teacher> findAll() {
		return teacherRepository.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return teacherRepository.saveAndFlush(teacher);
	}

	@Override
	public Teacher findByTeacherid(int teacherid) {
		return teacherRepository.findById(teacherid).get();
	}

	@Override
	public void deleteTeacher(int teacherid) {
		teacherRepository.deleteById(teacherid);
	}

}
