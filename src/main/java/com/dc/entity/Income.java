package com.dc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Income {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer salaryIncome;
	private Integer propertyIncome;
	private Integer appNumber;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSalaryIncome() {
		return salaryIncome;
	}
	public void setSalaryIncome(Integer salaryIncome) {
		this.salaryIncome = salaryIncome;
	}
	public Integer getPropertyIncome() {
		return propertyIncome;
	}
	public void setPropertyIncome(Integer propertyIncome) {
		this.propertyIncome = propertyIncome;
	}
	public Integer getAppNumber() {
		return appNumber;
	}
	public void setAppNumber(Integer appNumber) {
		this.appNumber = appNumber;
	}
	
	public Income(Integer salaryIncome, Integer propertyIncome, Integer appNumber) {
		super();
		this.salaryIncome = salaryIncome;
		this.propertyIncome = propertyIncome;
		this.appNumber = appNumber;
	}
	public Income() {
		super();
	}
	@Override
	public String toString() {
		return "Income [id=" + id + ", salaryIncome=" + salaryIncome + ", propertyIncome=" + propertyIncome + "]";
	}
}
