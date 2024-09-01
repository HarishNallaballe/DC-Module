package com.dc.service;

import java.util.List;

import com.dc.entity.Kid;

public interface KidService {
	
	public String saveKids(List<Kid> kid);
	
	public List<Kid> kids();
	
	public Kid getKidById(Integer id);
	
	public List<Kid> getKidsBYAppNumber(Integer appNumber);

}
