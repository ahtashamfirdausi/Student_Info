package com.studentInfo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_info")
public class Student_info {
	@Id
	@GeneratedValue
	@Column(name = "Student_Id")
	private Integer Student_Id;
	@Column(name = "Student_name", length = 45, nullable = false)
	private String Student_name;
	@Column(name = "Student_address", length = 45)
	private String Student_address;
	@Column(name = "Fathers_name", length = 45, nullable = false)
	private String Fathers_name;
	@Column(name = "Phone_number", length = 45)
	private Integer Phone_number;
	@Column(name = "Class_info_idClass_info")
	private Integer Class_info_idClass_info;
	
	public Student_info() {
		super();
	}

	public Integer getStudent_Id() {
		return Student_Id;
	}

	public void setStudent_Id(Integer student_Id) {
		Student_Id = student_Id;
	}

	public String getStudent_name() {
		return Student_name;
	}

	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}

	public String getStudent_address() {
		return Student_address;
	}

	public void setStudent_address(String student_address) {
		Student_address = student_address;
	}

	public String getFathers_name() {
		return Fathers_name;
	}

	public void setFathers_name(String fathers_name) {
		Fathers_name = fathers_name;
	}

	public Integer getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(Integer phone_number) {
		Phone_number = phone_number;
	}

	public Integer getClass_info_idClass_info() {
		return Class_info_idClass_info;
	}

	public void setClass_info_idClass_info(Integer class_info_idClass_info) {
		Class_info_idClass_info = class_info_idClass_info;
	}


}
