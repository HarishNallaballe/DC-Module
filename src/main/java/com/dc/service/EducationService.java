package com.dc.service;

import java.util.List;

import com.dc.entity.Education;

public interface EducationService {
	
	public boolean saveEducationDetails(Education education);
	
	public List<Education> getEducationDetails();
	
	public Education getEducationDeailsById(Integer id);
	
	public Education getEducationDeailsByAppNumber(Integer appNumber);

}
