package com.springtransaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springtransaction.entity.Student;
import com.springtransaction.service.StudentService;
@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/saveall")
	public List<Student> saveAllStudents(@RequestBody List<Student> studentList) {
		List<Student> studentResponse = (List<Student>) studentService.saveAllStudent(studentList);
		return studentResponse;
	}
	
	@DeleteMapping(value = "/delete")
	public String delete(@RequestBody Student student) {
		studentService.delete(student);
		return "Student deleted successfully";
	}
	
	@DeleteMapping(value = "/deleteinbatch")
	public String deleteInBatch(@RequestBody List<Student> studentList) {
		studentService.deleteInBatch(studentList);
		return "Student deleted successfully";
	}

}
