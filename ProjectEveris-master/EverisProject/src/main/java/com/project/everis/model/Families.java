package com.project.everis.model;

import javax.persistence.*;

@Entity
@Table(name="families")
public class Families {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int familyid;
	
	@Column(name="familyname", length = 20)
	private String familyname;
	
//	@OneToMany(mappedBy = "parentsreferencestofamily", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JsonProperty("parentsreferencestofamily")
//	private Collection<Parents> familyreferencestoparents;
//	
//	@OneToMany(mappedBy = "familyMembersReferencestoFamily" , fetch = FetchType.EAGER)
//	@JsonIgnoreProperties("familyMembersReferencestoFamily")
//	private List<FamilyMembers> familiesReferencesToFamilyMenbers;
//	

}
