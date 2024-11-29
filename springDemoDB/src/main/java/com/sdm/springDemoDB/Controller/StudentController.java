package com.sdm.springDemoDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sdm.springDemoDB.Entities.Student;
import com.sdm.springDemoDB.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/")
	public String display() {
		return "Hello, World we welcome you";
	}
	@GetMapping("/csrf-token")
	public CsrfToken getToken(CsrfToken c) {
		return c;
	}
	@GetMapping("/studentDetails")
	public List<Student> getStudentDetails(){
		System.out.println("sfasfsafasf");
		return studentService.getStudentsDetails();
	}
	@GetMapping("/getStudentById/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student s) {
		return studentService.saveStudent(s);
	}
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}
}
