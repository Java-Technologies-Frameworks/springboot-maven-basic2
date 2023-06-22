package com.jtf.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jtf.springboot.demo.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	
	@RequestMapping("/user")
	public String getUser(Model model) {
		model.addAttribute("users",userRepository.findAll());
		return "index";
		
	}
	
	@RequestMapping("/person")
	public String getPerson(Model model) {
		model.addAttribute("users",userRepository.findAll());
		return "index";
		
	}
}
