package com.project.everis.model;

import javax.persistence.*;


@Entity
@Table(name="familymembers")
public class FamilyMembers  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="familymemberid")
	private int familymemberid;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="familyid")
//	@JsonIgnoreProperties("familiesReferencesToFamilyMenbers")
//	private Families familyMembersReferencestoFamily;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="parentid")
//	@JsonIgnoreProperties("parentsReferencestoFamilyMembers")
//	private Parents familymembersreferencestoparents;	
	
	@Column(name="parentorstudentmember")
	private String parentorstudentmember;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="studentid")
//	@JsonIgnoreProperties("studentReferencesToFamilyMembers")
//	private Students studentsreferencestofamilymember;

	
}
