package com.everis.project.model;

import javax.persistence.*;


@Entity
@Table(name="studentclass")
public class StudentClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;

	
}
