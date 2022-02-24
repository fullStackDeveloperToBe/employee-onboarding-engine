package com.employee.onboarding.engine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;	

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "ID", columnDefinition = "SERIAL")
	int id;
	
	@Column(name = "EMPLOYEE_NAME")
	String name;
	
	@Column(name = "EMPLOYEE_ID")
	String employeeId;
	
	@Column(name = "EMAIL")
	String emailId;
	
	@Column(name = "PHONE")
	String phone;
	
	@Column(name = "QUALIFICATION")
	String qualification;
	
	@Column(name = "EXPERIENCE")
	String experience;
	
	@Column(name = "SKILLS")
	String skills;
	
	@Column(name = "COMMENT_")
	String comments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
