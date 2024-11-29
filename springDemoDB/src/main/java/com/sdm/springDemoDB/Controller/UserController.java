package com.sdm.springDemoDB.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sdm.springDemoDB.Entities.User;
import com.sdm.springDemoDB.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/registerUser")
	public User register(@RequestBody User user) {
		return userService.register(user);
	}
	
	@PostMapping("/loginUser")
	public String login(@RequestBody User user) {
		System.out.println(user);
		return userService.verify(user);
	}
}
