package com.telusko.SecureAppDemo;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecureController 
{
	@Autowired
	ServiceImplementation ser;
	
	@RequestMapping("/home")
	public String Home(Model m)
	{
		m.addAttribute("users",ser.findRecords());
		return "Home";
	}
	
	@RequestMapping("/login")
	public String login(Model m)
	{
		m.addAttribute("obj1",new UserModel() );
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout(Model m)
	{
		return "logout";
	}
	
	
	
}
