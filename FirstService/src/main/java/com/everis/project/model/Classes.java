package com.everis.project.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Use of lombok
@Data
@Setter
@Entity
@Table(name="classes")
public class Classes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classid;
	
	@NotNull(message = "Enter class code")
	@Size(min=4, max=4, message = "The class code must have 4 characters.")
	@Column(name="classcode")
	private String classcode;
	
	@NotNull(message = "Enter class name")
	@Size(min=1, max=20, message = "The class name must be greater than one character and less than or equal to 20 characters.")
	@Column(name="classname")
	private String classname;
	
	@NotNull(message = "Enter date from")
	@Column(name="datefrom")
	@Temporal(TemporalType.DATE)
	private Date datefrom;
	
	@NotNull(message = "Enter date to")
	@Column(name="dateto")
	@Temporal(TemporalType.DATE)
	private Date dateto;
	
//	Relations
	
	
	@OneToMany(mappedBy = "classesReference", fetch = FetchType.LAZY)
	@JsonIgnoreProperties("classesReference")
	private List<StudentClass> studentReference;
	
//	@OneToOne(cascade = CascadeType.ALL)
////	@JsonIgnoreProperties("classesforsubject")
//	@JoinColumn(name= "classesforsubject")
//	private Subject subjectreference;
	
}
