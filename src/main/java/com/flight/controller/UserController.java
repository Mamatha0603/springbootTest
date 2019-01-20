package com.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.dao.UserDAO;
import com.flight.entities.User;
import com.flight.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	
	

	@RequestMapping("/showRegistration")
	public String showRegistrationPage() {

		return "registerUser";
	}

	@PostMapping("/registerUser")
	public String register(@ModelAttribute("user") User user) {
		System.out.println("in registerUser method.."+user.getEmail());
		//userDAO.save(user);
		userService.saveUser(user);
		System.out.println("in registerUser method..xxxx"+user.getEmail());
        return "login";
	}
	@RequestMapping("/showLogin")
	public String showLoginPage() {

		return "login";
	}
	
	
	@RequestMapping( value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("email") String email,@RequestParam("password") String password, 
			ModelMap modelMap) {
		System.out.println("In login USer Controller method.....");
		 User user=userService.getEmail(email);
		 System.out.println("User email:"+user.getEmail());
		 System.out.println("User password:"+user.getPassword());
		 
		 if(user.getPassword().equals(password)) {
			 return "findFlights";
		 }
		 else{
			 modelMap.addAttribute("msg", "Please enter valid username and password");
		 }
		 
		return "login";
	}

}
