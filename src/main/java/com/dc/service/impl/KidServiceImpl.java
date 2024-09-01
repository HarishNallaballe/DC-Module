package com.dc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.entity.Kid;
import com.dc.repo.KidRepo;
import com.dc.service.KidService;

@Service
public class KidServiceImpl implements KidService{
	
	@Autowired
	private KidRepo kidRepio;

	@Override
	public String saveKids(List<Kid> kids) {
		for(Kid kid : kids) {
			kidRepio.save(kid);
		}
		return "Kids saved succesfully";
	}

	@Override
	public List<Kid> kids() {
		return kidRepio.findAll();
	}

	@Override
	public Kid getKidById(Integer id) {
		return kidRepio.findById(id).get();
	}

	@Override
	public List<Kid> getKidsBYAppNumber(Integer appNumber) {
		return kidRepio.findByAppNumber(appNumber);
	}

}
