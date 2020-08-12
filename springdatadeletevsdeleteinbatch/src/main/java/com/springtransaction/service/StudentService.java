package com.springtransaction.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springtransaction.entity.Student;

@Component
public interface StudentService {
	
	public List<Student> saveAllStudent(List<Student> studentList);
	
	public void deleteInBatch(List<Student> student);
	
	public void delete(Student student);

}
