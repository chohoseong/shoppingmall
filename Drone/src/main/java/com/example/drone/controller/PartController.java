package com.example.drone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.drone.service.PartService;

@Controller

public class PartController {
	@Autowired
	private PartService partservice;
	
	@RequestMapping(value = "/partorder", method = RequestMethod.GET)
	public ModelAndView Getpartorder() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("title",partservice.selectallPart());
		return mav;
	}
}