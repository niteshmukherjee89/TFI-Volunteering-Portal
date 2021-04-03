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
import com.tfi.vp.service.CreateOpportunityService;
import com.tfi.vp.service.SearchOpportunitiesService;

@RestController
public class CreateOpsController {

	@Resource 
	CreateOpportunityService createOppService;
	
	@PostMapping("/createOpsForm")                     
    public ModelAndView createOpsForm(@RequestParam("vol_email") String volEmail,
    								  @RequestParam("vol_pass") String volPassword,
    								
                              ModelMap modelMap) 
	{
		ModelAndView mav = new ModelAndView("createOpsForm"); 
		mav.addObject("loginStatus",createOppService.validateLogin(volEmail,volPassword));
		return mav;
        
    }
	
	@PostMapping("/saveNewOpportunity")                     
    public ModelAndView saveNewOpps(@RequestParam("oppTitle") String oppTitle,
    								@RequestParam("oppStartDate") String oppStartDate,
    								@RequestParam("oppEndDate") String oppEndDate,
    								@RequestParam("oppDailyHrs") String oppDailyHrs,
    								@RequestParam("oppArea") String oppArea,
    								@RequestParam("oppCity") String oppCity,
    								@RequestParam("oppState") String oppState,
    								@RequestParam("oppCreator") String oppCreator,
    								@RequestParam("oppDesc") String oppDesc,
    								
                              ModelMap modelMap) 
	{
		ModelAndView mav = new ModelAndView("createOpsStatus"); 
		mav.addObject("saveStatus",createOppService.saveNewOpportunity(oppTitle,oppStartDate,oppEndDate,oppDailyHrs,oppArea,oppCity,oppState,oppCreator,oppDesc));
		return mav;
        
    }
	
	@RequestMapping(value = "/createOpsLogin", method = RequestMethod.GET)
	public ModelAndView  createOpsLogin(ModelMap model) {
		ModelAndView mav = new ModelAndView("createOpsLogin"); 
		return mav;
	}
	
	
}
