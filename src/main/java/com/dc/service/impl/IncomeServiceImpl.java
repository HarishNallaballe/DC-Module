package com.dc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.entity.Income;
import com.dc.repo.IncomeRepo;
import com.dc.service.IncomeService;

@Service
public class IncomeServiceImpl implements IncomeService{
	
	@Autowired
	private IncomeRepo incomeRepo;

	@Override
	public boolean saveIncome(Income income) {
		Income saved = incomeRepo.save(income);
		return saved.getId()!=null;
	}

	@Override
	public List<Income> getAll() {
		return incomeRepo.findAll();
	}

	@Override
	public Income incomeById(Integer id) {
		return incomeRepo.findById(id).get();
	}

	@Override
	public Income getByAppNumber(Integer appNumber) {
		Income income = incomeRepo.findByAppNumber(appNumber);
		return income;
	}

}
