package com.telusko.SecureAppDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceImplementation implements Service
{
	@Autowired
	UserRepository repo;

	@Override
	public List<UserModel> findRecords() 
	{
		
		return repo.findAll();
	}

}
