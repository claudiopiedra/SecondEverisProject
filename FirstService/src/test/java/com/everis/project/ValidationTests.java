package com.everis.project;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.everis.project.model.Classes;
import com.everis.project.model.StudentClass;
import com.everis.project.model.Subject;
import com.everis.project.model.Teacher;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidationTests {

	@InjectMocks
	Classes classes;
	
	@InjectMocks
	StudentClass studentclass;
	
	@InjectMocks
	Subject subject;
	
	@InjectMocks
	Teacher teacher;
	
	@Test
	public void testClassValidations() {
		classes.setClassid(1);
		classes.setClasscode("CC01");
		classes.setClassname("Matematica I");
		classes.setDatefrom(null);
		classes.setDateto(null);
		
		//validate the input
		ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<Classes>> vs = validator.validate(classes);
		
		vs.forEach((v) -> {
			System.out.print("-->" + v.getPropertyPath()+ ":" + v.getMessage());
		});
		
	}
	
	@Test
	public void testStudentClassValidations() {
		studentclass.setStudentid(1);
		studentclass.setFirstname("Claudio");
		studentclass.setMiddlename("Paolo");
		studentclass.setLastname("Piedra");
		
		//validate the input
				ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
				Validator validator = factory.getValidator();
				Set<ConstraintViolation<StudentClass>> vs = validator.validate(studentclass);
				
				vs.forEach((v) -> {
					System.out.print("-->" + v.getPropertyPath()+ ":" + v.getMessage());
				});
	}
	
	@Test
	public void testSubjectValidations() {
		subject.setSubjectid(1);
		subject.setSubjectname("Ingles 1");
		
		//validate the input
		ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<Subject>> vs = validator.validate(subject);
		
		vs.forEach((v) -> {
			System.out.print("-->" + v.getPropertyPath()+ ":" + v.getMessage());
		});
	}
	
	@Test
	public void testTeacherValidations() {
		teacher.setTeacherid(1);
		teacher.setSchoolid("SC01");
		teacher.setGender("Male");
		teacher.setFirstname("Claudio");
		teacher.setMiddlename("Paolo");
		teacher.setLastname("Piedra");
		teacher.setOtherteacherdetails("other");
		
		//validate the input
				ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
				Validator validator = factory.getValidator();
				Set<ConstraintViolation<Teacher>> vs = validator.validate(teacher);
				
				vs.forEach((v) -> {
					System.out.print("-->" + v.getPropertyPath()+ ":" + v.getMessage());
				});
	}
	
//	public void testNotNull() {
//		final Classes classes = new Classes();
//		classes.setClasscode(null);
//		
//		Set<ConstraintViolation<Classes>> constraintViolations = validate(classes);
//        Assert.assertTrue("Your error message", constraintViolations.notNull == null);
//	}

}
