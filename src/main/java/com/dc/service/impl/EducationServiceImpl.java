package com.dc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.entity.Education;
import com.dc.repo.EducationRepo;
import com.dc.service.EducationService;

@Service
public class EducationServiceImpl implements EducationService{

	@Autowired
	private EducationRepo educationRepo;

	@Override
	public boolean saveEducationDetails(Education education) {
		Education saved = educationRepo.save(education);
		return saved.getId()!=null;
	}

	@Override
	public List<Education> getEducationDetails() {
		return educationRepo.findAll();
	}

	@Override
	public Education getEducationDeailsById(Integer id) {
		return educationRepo.findById(id).get();
	}

	@Override
	public Education getEducationDeailsByAppNumber(Integer appNumber) {
		return educationRepo.findByAppNumber(appNumber);
	}
	
	
}
