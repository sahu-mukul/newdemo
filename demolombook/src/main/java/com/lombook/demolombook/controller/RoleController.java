package com.lombook.demolombook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lombook.demolombook.entity.Role;
import com.lombook.demolombook.service.RoleService;

@RestController
@CrossOrigin(origins = "http://localhost:8080") 	
@RequestMapping("/find/user")
public class RoleController {

	@Autowired
	private RoleService roleservice;
	
	@PostMapping("/addrole")
	public ResponseEntity<Role> create(@RequestBody Role role)
	{
		this.roleservice.save(role);
		return new ResponseEntity<Role>(role,HttpStatus.CREATED);
	}
	
	@GetMapping("/role")
	public ResponseEntity<List<Role>> findAll() {
		List<Role> role = this.roleservice.findAll();
		return new ResponseEntity<List<Role>>(role, HttpStatus.OK);
	} 
}
