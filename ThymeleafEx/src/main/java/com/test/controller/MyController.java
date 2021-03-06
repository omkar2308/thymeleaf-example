package com.test.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("inside about handler");

		model.addAttribute("name", "Akshay");
		model.addAttribute("currentDate", new Date());

		return "about";
	}

	// iterator handler
	@GetMapping("/loop")
	public String iterateHandler(Model m) {
		System.out.println("in loop handler");
		List<String> names = List.of("Akshay", "omkar", "abhi");
		m.addAttribute("names", names);
		return "iterate";

	}
	
	//conditional 
	@GetMapping("/condition")
	public String conditionHnadler(Model m) {
		System.out.println("in condition handler");
		
		m.addAttribute("isActive",false);   
		m.addAttribute("gender","M");
		//m.addAttribute("gender","p");
		
		List<Integer> list = List.of(23,55,8);
		
		m.addAttribute("mylist",list); 
		
		return "condition";
	}

}
