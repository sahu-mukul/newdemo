package com.lombook.demolombook.service.impl;

import java.util.List;

import com.lombook.demolombook.entity.Role;

public interface IRoleService {

	public void save(Role role);
	public List<Role> findAll();
	
}
