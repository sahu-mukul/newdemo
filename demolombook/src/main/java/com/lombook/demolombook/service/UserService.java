package com.lombook.demolombook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lombook.demolombook.entity.Users;
import com.lombook.demolombook.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	 public UserRepository userrepository;

	    public void save(Users user) {
			this.userrepository.save(user);
		}
	    
	    public List<Users> findAll() {
			return this.userrepository.findAll();
		}
	   
	    public Users login(Users user1)
		{ List<Users> users;
		Users user=new Users();
		
		users=this.userrepository.findAll();
		//TODO I will remove this loop and add filter
		for(Users u: users)
		{
			
			
			if((u.getName().equals(user1.getName())) && (u.getPassword().equals(user1.getPassword())))
			{
				System.out.println(user1.getName());
				user=u;
				break;
			}
			
		}
		
		
		 return user;
	    	//return user.get();
		}
}
