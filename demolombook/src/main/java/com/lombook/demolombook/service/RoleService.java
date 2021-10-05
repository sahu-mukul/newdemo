package com.lombook.demolombook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lombook.demolombook.entity.Role;
import com.lombook.demolombook.repository.RoleRepository;
import com.lombook.demolombook.service.impl.IRoleService;


@Service
public class RoleService implements IRoleService {

	@Autowired
	private RoleRepository rolerepository;
	
	public void save(Role role)
	{
		this.rolerepository.save(role);
	}
	public List<Role> findAll() {
		return this.rolerepository.findAll();
	}
	
	
}
