package com.tfi.vp.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class VolunteerOpsController {

	@RequestMapping(value = "/volunteerOpportunityPortal", method = RequestMethod.GET)
	public ModelAndView  welcomePage(ModelMap model) {
		ModelAndView mav = new ModelAndView("volunteerOps"); 
		return mav;
	}
	

}
