package com.springtransaction.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springtransaction.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

	//void delete(List<Student> student);

	//void deleteInBatch(List<Student> studentList);

}
