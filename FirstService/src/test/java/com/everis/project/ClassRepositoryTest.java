package com.everis.project;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.everis.project.model.Classes;
import com.everis.project.repository.ClassRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassRepositoryTest {
	
	@Autowired
	private ClassRepository classRepository;
	
	@Test
	public void testClassRepository1() {
		List<Classes> classes = classRepository.findAll();
		
		assertThat(classes.size()).isEqualTo(1);
	}

}
