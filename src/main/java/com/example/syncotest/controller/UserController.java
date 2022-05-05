package com.example.syncotest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.syncotest.model.User;
import com.example.syncotest.repo.UserRepo;
import com.example.syncotest.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepo userRepo;
	
	@GetMapping("/")
	public  Map<String, String>  index() {
		 HashMap<String, String> map = new HashMap<>();
		    map.put("key", "value");
		    map.put("foo", "bar");
		    map.put("aa", "bb");
		    return map;
	}
	
	
	@PostMapping(path="/testPost", consumes = "application/json")
	public  User testPost(@RequestBody User formUser) {
		 return userService.saveUserData(formUser);
	}

}
