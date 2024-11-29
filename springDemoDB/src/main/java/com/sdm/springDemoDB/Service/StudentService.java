package com.sdm.springDemoDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdm.springDemoDB.Entities.Student;
import com.sdm.springDemoDB.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo studentRepo;
	public List<Student> getStudentsDetails() {
		return studentRepo.findAll();
	}
	
	public Student getStudentById(int id) {
		return studentRepo.findById(id).orElse(new Student());
	}
	
	public Student saveStudent(Student s) {
		return studentRepo.save(s);
	}
	public String deleteStudent(int id) {
		if(studentRepo.existsById(id)) {
			studentRepo.deleteById(id);
			return "Data deleted successfully";
		}else {
			return "Record not found to delete";
		}
	}
}
