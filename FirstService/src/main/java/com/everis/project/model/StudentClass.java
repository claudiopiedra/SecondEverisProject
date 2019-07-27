package com.everis.project.model;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Setter;

//Use of lombok
@Data
@Setter
@Entity
@Table(name="studentclass")
public class StudentClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;
	
	private String studentname;
	
	@Column(name="datefrom")
	private Date datefrom;
	
	@Column(name="dateto")
	private Date dateto;
	
//	Relations
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("studentReference")
	@JoinColumn(name= "studentReference")
	private Classes classesReference;
	
}
