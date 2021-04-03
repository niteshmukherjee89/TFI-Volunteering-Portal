package com.tfi.vp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tfi.vp.entity.Opportunities;
import com.tfi.vp.service.RegisterOpportunityService;
import com.tfi.vp.service.SearchOpportunitiesService;

@RestController
public class RegisterOpsController {

	@Resource 
	RegisterOpportunityService regoppService;
	
	
	@RequestMapping(value = "/registerOpp", method = RequestMethod.GET)                  
    public ModelAndView reisterForOpportunity(@RequestParam("id") String oppId,
    								ModelMap modelMap) 
	{
		ModelAndView mav = new ModelAndView("registerOpp"); 
		mav.addObject("oppId", oppId);
		return mav;
        
    }
	
	
	@PostMapping("/validateAndRegisterOpportunity")                     
    public ModelAndView saveDetails(@RequestParam("vol_email") String vol_email,
    								@RequestParam("vol_mobile") String vol_mobile,
    								@RequestParam("vol_avail") String vol_avail,
    								@RequestParam("vol_reason") String vol_reason,
    								@RequestParam("oppId") String oppId,
                              ModelMap modelMap) 
	{
		ModelAndView mav = new ModelAndView("volunteerOpsStatus"); 
		mav.addObject("regStatus",regoppService.registerVolunteer(vol_email,vol_mobile,vol_avail,vol_reason,oppId));
		return mav;
        
    }
	
	
}
