package com.studentInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.studentInfo.model.Student_all_info;
import com.studentInfo.model.Student_info;

@Repository
public interface StudentRepository extends JpaRepository<Student_info, Long>{

	@Query(value = "select s from Student_info s WHERE s.Student_Id =:Student_Id ")
	Student_all_info findByStudent_Id(@Param("Student_Id") Integer Student_Id);

}
