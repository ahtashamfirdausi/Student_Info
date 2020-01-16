package com.studentInfo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "class_info")
public class Class_info {
	@Id
	@GeneratedValue
	@Column(name = "idClass_info")
	private Integer idClass_info;
	@Column(name = "Class_name", length = 45)
	private String Class_name;
	
	public Class_info() {
		super();
	}

	public Integer getIdClass_info() {
		return idClass_info;
	}

	public void setIdClass_info(Integer idClass_info) {
		this.idClass_info = idClass_info;
	}

	public String getClass_name() {
		return Class_name;
	}

	public void setClass_name(String class_name) {
		Class_name = class_name;
	}
}
