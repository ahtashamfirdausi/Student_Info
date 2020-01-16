package com.studentInfo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentInfo.model.Student_all_info;
import com.studentInfo.model.Student_info;
import com.studentInfo.repository.StudentRepository;

@Service

public class StudentService {
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student_info saveMethod() {
		Student_info student = new Student_info();
		return studentRepository.save(student);
		
	}
	
	public Student_all_info getStudentSubjectInfo(Integer student_Id) {
		Student_all_info student = studentRepository.findByStudent_Id(student_Id);
		return student;
	}

	public Student_info postStudentInfo(Student_info student) {
		return studentRepository.save(student);
	}

	public void deleteById(Long id) {
		studentRepository.deleteById(id);
	}

	public Optional<Student_info> getStudentInfo(Long student_Id) {
		Optional<Student_info> student = studentRepository.findById(student_Id);
		return student;
	}

	}


