package com.everis.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="studentclass")
public class StudentClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;
	
	@NotNull(message = "Enter first name")
	@Size(min=1, max=10, message = "The first name must be greater than one character and less than or equal to 10 characters.")
	@Column(name="firstname")
	private String firstname;
	
	@Size(min=1, max=10, message = "The middle name must be greater than one character and less than or equal to 10 characters.")
	@Column(name="middlename")
	private String middlename;
	
	@NotNull(message = "Enter last name")
	@Size(min=1, max=10, message = "The last name must be greater than one character and less than or equal to 10 characters.")
	@Column(name="lastname")
	private String lastname;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
