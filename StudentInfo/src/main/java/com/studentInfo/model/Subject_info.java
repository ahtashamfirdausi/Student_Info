package com.studentInfo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject_info")
public class Subject_info {
	@Id
	@GeneratedValue
	@Column(name = "idSubject_info")
	private Integer idSubject_info;
	@Column(name = "Subject_name",length = 45)
	private String Subject_name;
	public Subject_info() {
		super();
	}

	public Integer getIdSubject_info() {
		return idSubject_info;
	}

	public void setIdSubject_info(Integer idSubject_info) {
		this.idSubject_info = idSubject_info;
	}

	public String getSubject_name() {
		return Subject_name;
	}

	public void setSubject_name(String subject_name) {
		Subject_name = subject_name;
	}

}
