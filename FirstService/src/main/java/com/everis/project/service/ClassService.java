package com.everis.project.service;

import java.util.List;

import com.everis.project.model.Classes;


public interface ClassService {
	
	List<Classes> findAll();
	
	Classes saveClasses(Classes classes);
			
	Classes updateClasses(Classes classes);
	
	Classes findByClassid(int classid);
		
	void deleteClasses(int classid);

}
