package com.sdm.springDemoDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdm.springDemoDB.Entities.User;



public interface UserRepo extends JpaRepository<User,Integer> {
	User findByUsername(String username);
}
