package com.mathquiz.repositories;

import com.mathquiz.domain.LookupType;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LookupTypeRepository extends JpaRepository<LookupType, String>{

	LookupType findByName(String type);}
