package com.example.drone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.drone.service.MemberService;

@Controller
public class HomeController {
	
	@Autowired
	MemberService service;
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String GetHome() {
		return "home";
	}
	@RequestMapping(value = "/homelogin", method = RequestMethod.GET)
	public String GetHomeLogin() {
		return "homelogin";
	}
	
	@GetMapping("/sample1")
	public void sample1(Model model) {
		model.addAttribute("greeting","안녕");
	}
}