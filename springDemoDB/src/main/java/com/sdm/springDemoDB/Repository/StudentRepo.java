package com.sdm.springDemoDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdm.springDemoDB.Entities.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
