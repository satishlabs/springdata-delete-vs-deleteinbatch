package com.springtransaction.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springtransaction.entity.Student;
import com.springtransaction.repository.StudentRepository;
import com.springtransaction.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Transactional
	public List<Student> saveAllStudent(List<Student> studentList) {
		List<Student> response = (List<Student>) studentRepository.saveAll(studentList);
		return response;
	}

	@Transactional
	public void delete(Student student) {
		long start = System.currentTimeMillis();
		studentRepository.delete(student);
		long end = System.currentTimeMillis();
		System.out.println("Time taken by delete--" + (int) (end - start));
		
	}

	@Override
	public void deleteInBatch(List<Student> studentList) {
		long start = System.currentTimeMillis();
		studentRepository.deleteInBatch(studentList);
		long end = System.currentTimeMillis();
		System.out.println("Time taken by deleteInBatch--" + (int) (end - start));
	}

	

	
}