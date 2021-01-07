package com.example.drone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.drone.service.BoardService;
@Controller
public class BoardController {
	@Autowired
	BoardService boardserivce;
	
	@RequestMapping(value = "/Board", method = RequestMethod.GET)
	public ModelAndView GetBoard() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("title",boardserivce.selectallQuestion());
		return mav;
	}
}
