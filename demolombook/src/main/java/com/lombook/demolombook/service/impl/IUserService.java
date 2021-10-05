package com.lombook.demolombook.service.impl;

import java.util.List;

import com.lombook.demolombook.entity.Users;

public interface IUserService {

	void save(Users user);
	List<Users> findAll();
	Users login(Users user1);
}
