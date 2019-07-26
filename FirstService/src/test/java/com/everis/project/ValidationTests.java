package com.everis.project;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.everis.project.model.Classes;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidationTests {

	
	
	@Test
	public void testClassValidations() {
	Classes classes = new Classes();
		classes.setClassid(1);
		classes.setClasscode(null);
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
	
//	public void testNotNull() {
//		final Classes classes = new Classes();
//		classes.setClasscode(null);
//		
//		Set<ConstraintViolation<Classes>> constraintViolations = validate(classes);
//        Assert.assertTrue("Your error message", constraintViolations.notNull == null);
//	}

	
}
