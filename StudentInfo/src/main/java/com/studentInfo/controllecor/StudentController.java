package com.studentInfo.controllecor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentInfo.model.Student_all_info;
import com.studentInfo.model.Student_info;
import com.studentInfo.services.StudentService;

@Controller
@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/save-student")
	public ResponseEntity<Student_info> saveStudent(@RequestBody Student_info student) {
		student = studentService.postStudentInfo(student);
		HttpStatus status = HttpStatus.BAD_REQUEST;
		if (student  != null) {
			status = HttpStatus.OK;
		}
		return new ResponseEntity<Student_info>(status);
	}
	@GetMapping("/get_student_all/{Student_Id}")
	public ResponseEntity<Optional<Student_info>> getStudentAll(@PathVariable Long Student_Id) {
		System.out.println("in controller");
		Optional<Student_info> student_all_info = studentService.getStudentInfo(Student_Id);
		HttpStatus status = HttpStatus.NO_CONTENT;
		if (student_all_info != null) {
			status = HttpStatus.OK;
		}
		return new ResponseEntity<Optional<Student_info>>(student_all_info, status);
		
	}

	  @DeleteMapping("/employees/{id}")
	  public void deleteStudent(@PathVariable Long id) {
	    studentService.deleteById(id);
	  }
	  
	  @GetMapping("/get_student_subject_info/{Student_Id}")
		public ResponseEntity<Student_all_info> getStudentSubjectInfo(@PathVariable Integer Student_Id) {
			Student_all_info student_all_info = new Student_all_info();
			student_all_info = studentService.getStudentSubjectInfo(Student_Id);
			HttpStatus status = HttpStatus.NO_CONTENT;
			if (student_all_info != null) {
				status = HttpStatus.OK;
			}
			return new ResponseEntity<Student_all_info>(student_all_info, status);
			
		}
	  

}