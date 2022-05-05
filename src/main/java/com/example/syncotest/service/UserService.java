package com.example.syncotest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syncotest.model.User;
import com.example.syncotest.repo.UserRepo;

@Service("userService")
public class UserService {

	
	@Autowired 
	UserRepo userRepo;
	
	public User saveUserData(User user) {
		User userModel = populateUserEntity(user);
		return userRepo.save(userModel);
		
	}
	private User populateUserEntity(User user) {
        User addUser = new User();
        addUser.setFname(user.getFname());
        addUser.setLname(user.getLname());
        addUser.setEmail(user.getEmail());
        addUser.setMobile(user.getMobile());
        return addUser;
    }
}
