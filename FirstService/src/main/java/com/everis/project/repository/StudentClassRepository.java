package com.everis.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.project.model.StudentClass;

@Repository
public interface StudentClassRepository extends JpaRepository<StudentClass, Integer>{

}
