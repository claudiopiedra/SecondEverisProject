package com.everis.project.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Setter;

@Data
@Setter
@Entity
@Table(name="studentclass")
public class StudentClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;
	
//	Relations
	
	private String studentname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("studentReference")
	@JoinColumn(name= "studentReference")
	private Classes classesReference;
	

	
}
