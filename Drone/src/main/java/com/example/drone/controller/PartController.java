package com.example.drone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.drone.service.PartService;

@Controller
public class PartController {
	@Autowired
	private PartService partservice;

	
	@RequestMapping(value = "/partorder", method = RequestMethod.GET)
	public ModelAndView Getpartorder() {
		ModelAndView mav = new ModelAndView();
		//mav.addObject("title",partservice.selectallBattery());
		return mav;
	}
	
	@RequestMapping(value = "/partorder", method = RequestMethod.POST)
	public ModelAndView Postpartorder(@RequestParam("part") String str) {
		ModelAndView mav = new ModelAndView();
		
		switch(str) {
		case "Frame" : mav.addObject("title",partservice.selectallFrame()); break;
		case "Propeller" : mav.addObject("title",partservice.selectallPropeller()); break;
		case "Motor" : mav.addObject("title",partservice.selectallMotor()); break;
		case "Battery" : mav.addObject("title",partservice.selectallBattery()); break;
		case "Camera" : mav.addObject("title",partservice.selectallCamera()); break;
		}
		return mav;
	}

}
