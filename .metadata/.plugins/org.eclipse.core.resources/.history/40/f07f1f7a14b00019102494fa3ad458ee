package com.everis.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherid;

	@NotNull(message = "Enter a Schoold id")
	private int schoolid;
	
	@NotNull(message = "Enter a male or female gender")
	@Size(min=1, max=6, message = "The gender must be greater than one character and less than or equal to 6 characters.")
	@Column(name="gender")
	private String gender;
	
	@NotNull(message = "Enter firstname")
	@Size(min=1, max=15, message = "The first name must be greater than one character and less than or equal to 15 characters.")
	@Column(name="firstname")
	private String firstname;
	
	@NotNull(message = "Enter middle name")
	@Size(min=1, max=15,message = "The middle name must be greater than one character and less than or equal to 15 characters.")
	@Column(name="middlename")
	private String middlename;
	
	@NotNull(message = "Enter last name")
	@Size(min=1, max=15,message = "The last name must be greater than one character and less than or equal to 15 characters.")
	@Column(name="lastname")
	private String lastname;
	
	@Size(min=1, max=50, message = "The detail must be greater than one character and less than or equal to 50 characters.")
	@Column(name="otherteacherdetails")
	private String otherteacherdetails;


}
