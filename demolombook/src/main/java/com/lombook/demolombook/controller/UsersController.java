package com.lombook.demolombook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.lombook.demolombook.entity.Users;

import com.lombook.demolombook.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:8080") 	
public class UsersController {

	@Autowired
	private UserService userservice;
	
	@PostMapping("/addUsers")
	public ResponseEntity<Users> create(@RequestBody Users user)
	{ 
		
		this.userservice.save(user);
		return new ResponseEntity<Users>(user,HttpStatus.CREATED);
	}
	
	

    @GetMapping("/users")
    public ResponseEntity<List<Users>> findAll() {
		List<Users> users = this.userservice.findAll();
		return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
	}
    
    @PostMapping("/login")
    public ResponseEntity<Users> login(@RequestBody Users user)
    {  Users user2;
    	Users user1 = new Users();
    	user1.setName(user.getName());
    	user1.setPassword(user.getPassword());
    	user2=this.userservice.login(user1);
    	return new ResponseEntity<Users>(user2,HttpStatus.OK);
    	
    }
    
    
}
