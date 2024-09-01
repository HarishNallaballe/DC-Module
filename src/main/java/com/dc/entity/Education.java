package com.dc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String highestDegree;
	private Integer graduationYear;
	private String universityName;
	private Integer appNumber;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHighestDegree() {
		return highestDegree;
	}
	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}
	public Integer getGraduationYear() {
		return graduationYear;
	}
	public void setGraduationYear(Integer graduationYear) {
		this.graduationYear = graduationYear;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public Integer getAppNumber() {
		return appNumber;
	}
	public void setAppNumber(Integer appNumber) {
		this.appNumber = appNumber;
	}
	public Education(String highestDegree, Integer graduationYear, String universityName, Integer appNumber) {
		super();
		this.highestDegree = highestDegree;
		this.graduationYear = graduationYear;
		this.universityName = universityName;
		this.appNumber = appNumber;
	}
	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Education [id=" + id + ", highestDegree=" + highestDegree + ", graduationYear=" + graduationYear
				+ ", universityName=" + universityName + ", appNumber=" + appNumber + "]";
	}

}
