package com.project.everis.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Students")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="studentid")
	private int studentid;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="middlename")
	private String middlename;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="dateofbirth")
	private Date dateofbirth;

	@Column(name="otherstudentdetails")
	private String otherstudentdetails;
	
//	@ManyToMany(mappedBy = "studentsreferences")
//	@JsonIgnoreProperties("studentsreferences")
//	private Collection<Parents> parentsReferences;
//	
//	@OneToMany(mappedBy = "studentsreferencestofamilymember", fetch = FetchType.LAZY, orphanRemoval = true)
//	@JsonIgnoreProperties("studentsreferencestofamilymember")
//	private List<FamilyMembers> studentReferencesToFamilyMembers;

	
}
