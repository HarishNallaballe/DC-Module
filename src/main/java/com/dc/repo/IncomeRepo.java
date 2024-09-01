package com.dc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dc.entity.Income;

public interface IncomeRepo extends JpaRepository<Income, Integer>{

	public Income findByAppNumber(Integer appNumber);
	
}
