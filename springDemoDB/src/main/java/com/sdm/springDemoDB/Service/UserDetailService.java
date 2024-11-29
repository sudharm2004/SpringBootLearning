package com.sdm.springDemoDB.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sdm.springDemoDB.Entities.User;
import com.sdm.springDemoDB.Entities.UserPrincipal;
import com.sdm.springDemoDB.Repository.UserRepo;

@Service
public class UserDetailService implements UserDetailsService{
	@Autowired
	UserRepo userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=userRepo.findByUsername(username);
		if(user==null) {
			System.out.println("User not found");
			throw new UsernameNotFoundException("user not found");
		}
		return new UserPrincipal(user);
	}
	
}
