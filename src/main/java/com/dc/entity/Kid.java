package com.dc.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Kid {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Date dob;
	private Integer ssn;
	private Integer appNumber;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Integer getSsn() {
		return ssn;
	}
	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}
	public Integer getAppNumber() {
		return appNumber;
	}
	public void setAppNumber(Integer appNumber) {
		this.appNumber = appNumber;
	}
	public Kid(String name, Date dob, Integer ssn, Integer appNumber) {
		super();
		this.name = name;
		this.dob = dob;
		this.ssn = ssn;
		this.appNumber = appNumber;
	}
	public Kid() {
		super();
	}
	@Override
	public String toString() {
		return "Kid [id=" + id + ", name=" + name + ", dob=" + dob + ", ssn=" + ssn + ", appNumber=" + appNumber + "]";
	}
}
