package com.everis.project.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
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
	
	@Column(name="datefrom")
	private Date datefrom;
	
	@Column(name="dateto")
	private Date dateto;
	
//	Relations
	
	
	@OneToMany(mappedBy = "classesReference", fetch = FetchType.LAZY)
	@JsonIgnoreProperties("classesReference")
	private List<StudentClass> studentReference;
	
	
}
