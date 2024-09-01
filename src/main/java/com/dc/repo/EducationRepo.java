package com.dc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dc.entity.Education;

public interface EducationRepo extends JpaRepository<Education, Integer>{

	public Education findByAppNumber(Integer appNumber);
	
}
