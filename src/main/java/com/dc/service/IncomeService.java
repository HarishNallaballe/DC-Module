package com.dc.service;

import java.util.List;

import com.dc.entity.Income;

public interface IncomeService {
	
	public boolean saveIncome(Income income);
	
	public List<Income> getAll();
	
	public Income incomeById(Integer id);
	
	public Income getByAppNumber(Integer appNumber);

}
