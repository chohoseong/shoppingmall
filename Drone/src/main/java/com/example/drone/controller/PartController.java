package com.example.drone.controller;

import java.lang.reflect.InvocationTargetException;

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
	public ModelAndView Postpartorder(@RequestParam("part") String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ModelAndView mav = new ModelAndView();
		
		switch(str) {
		case "Frame" :
			mav.addObject("att",partservice.selectallFrame().get(0).attribute());
			mav.addObject("method",partservice.selectallFrame().get(0).method());
			mav.addObject("title",partservice.selectallFrame()); break;
		case "Propeller" :
			mav.addObject("att",partservice.selectallPropeller().get(0).attribute());
			mav.addObject("method",partservice.selectallPropeller().get(0).method());
			mav.addObject("title",partservice.selectallPropeller()); break;
		case "Motor" : 
			mav.addObject("att",partservice.selectallMotor().get(0).attribute());
			mav.addObject("method",partservice.selectallMotor().get(0).method());
			mav.addObject("title",partservice.selectallMotor()); break;
		case "Battery" :
			mav.addObject("att",partservice.selectallBattery().get(0).attribute());
			mav.addObject("method",partservice.selectallBattery().get(0).method());
			mav.addObject("title",partservice.selectallBattery()); break;
		case "Camera" :
			mav.addObject("att",partservice.selectallCamera().get(0).attribute());
			mav.addObject("method",partservice.selectallCamera().get(0).method());
			mav.addObject("title",partservice.selectallCamera()); break;
		}
		return mav;
	}

}
