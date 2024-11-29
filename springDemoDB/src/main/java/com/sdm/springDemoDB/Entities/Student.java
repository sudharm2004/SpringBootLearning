package com.sdm.springDemoDB.Entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Student {
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    
	    private String name;
	    private int age;
	    private String email;
	    private String course;
	    private String enrollmentDate;

	    // Getters and Setters
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getCourse() {
	        return course;
	    }

	    public void setCourse(String course) {
	        this.course = course;
	    }

	    public String getEnrollmentDate() {
	        return enrollmentDate;
	    }

	    public void setEnrollmentDate(String enrollmentDate) {
	        this.enrollmentDate = enrollmentDate;
	    }
	

}
