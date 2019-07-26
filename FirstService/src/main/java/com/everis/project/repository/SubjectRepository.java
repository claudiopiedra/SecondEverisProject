package com.everis.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.project.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
