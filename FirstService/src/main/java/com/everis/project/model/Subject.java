package com.everis.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

//Use of lombok
@Data
@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subjectid;
	
	@NotNull(message = "Enter subject name")
	@Size(min=1, max=20, message = "The subject name must be greater than one character and less than or equal to 20 characters.")
	@Column(name="subjectname")
	private String subjectname;	
	
//	Relations
	
	@OneToOne(mappedBy = "subjectreference",cascade = CascadeType.ALL  ,fetch = FetchType.LAZY)
	@JsonIgnoreProperties("subjectreference")
	private Classes classesforsubject;
	
}
