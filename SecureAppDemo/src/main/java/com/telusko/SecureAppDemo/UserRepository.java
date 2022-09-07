package com.telusko.SecureAppDemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Integer>
{
	UserModel findByName(String name);
}
