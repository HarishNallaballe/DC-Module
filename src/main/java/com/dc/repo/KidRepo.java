package com.dc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dc.entity.Kid;

public interface KidRepo extends JpaRepository<Kid, Integer>{

	public List<Kid> findByAppNumber(Integer appNumber);
	
}
