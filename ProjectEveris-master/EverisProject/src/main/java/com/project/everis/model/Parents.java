package com.project.everis.model;

import javax.persistence.*;

@Entity
@Table(name="parents")
public class Parents {

	@Id
	@Column(name="parentid", nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int parentid;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="middlename")
	private String middlename;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="otherparentdetails")
	private String otherparentdetails;
	
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JsonIgnoreProperties("parentsReferences")
//	@JoinTable(name="studentParents",
//			joinColumns=@JoinColumn(name="parentid",
//			referencedColumnName = "parentid"),
//			inverseJoinColumns=@JoinColumn(name="studentid",
//			referencedColumnName = "studentid"))
//	private Collection<Students> studentsreferences;
//
//	@ManyToOne(fetch = FetchType.EAGER, optional = false)
//	@JoinColumn(name="headoffamilyparentid")
//	@JsonProperty("familyreferencestoparents")
//	private Families parentsreferencestofamily;
//	
//	@OneToMany(mappedBy = "familymembersreferencestoparents",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	@JsonIgnoreProperties("familymembersreferencestoparents")
//	private List<FamilyMembers> parentsReferencestoFamilyMembers;

	
	
}
