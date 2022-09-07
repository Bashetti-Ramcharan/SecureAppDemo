package com.telusko.SecureAppDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class MyUserDetailsService implements UserDetailsService
{
	@Autowired
	private UserRepository rep;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException 
	{
		UserModel ob=rep.findByName(name);
		if(ob==null)
			throw new UsernameNotFoundException("User 404");
		
		return new UserPrinciple(ob);

	}

}
