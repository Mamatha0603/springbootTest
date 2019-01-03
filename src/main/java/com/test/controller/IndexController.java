package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.entity.IndexUser;
import com.test.service.IndexUserService;
import com.test.util.EmailUtil;

@Controller
public class IndexController {
	
	@Autowired
	private IndexUserService indexUserService;
	
	@Autowired
	private EmailUtil emailUtil;
	
	
	
	
	
	@GetMapping("/index1")
	public String index() {
		
		System.out.println("test notess"+indexUserService);
		//System.out.println("test notess"+indexUserService.createIndexUser(null));
		return "index1";
	}
	/*
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user) {
		
		ModelAndView  modelAndView=new ModelAndView();
		
		modelAndView.setViewName("user_data");
		modelAndView.addObject("user", user);
		return modelAndView;
		
	}*/
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute User user) {
		System.out.println("In controller...");
		
		indexUserService.createIndexUser(user);
		emailUtil.send(user.getEmail(), "Testing java mail", "Spring mail api tesing in spring boot application");
		
		 return "user_data";
		
		
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public int delete(@ModelAttribute User user) {
		return 0;
		
		
	}

}
