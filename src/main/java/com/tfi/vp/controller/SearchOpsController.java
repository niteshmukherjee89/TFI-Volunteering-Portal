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
import com.tfi.vp.service.SearchOpportunitiesService;

@RestController
public class SearchOpsController {

	@Resource 
	SearchOpportunitiesService searchOpportunityService;
	
	@PostMapping("/searchOpportunities")                     
    public ModelAndView saveDetails(@RequestParam("area") String searchArea,
    								@RequestParam("city") String searchCity,
    								@RequestParam("state") String searchState,
    								@RequestParam("startDate") String searchStartDate,
    								@RequestParam("endDate") String searchEndDate,
    								@RequestParam("dailyHrs") String searchDailyHrs,
                              ModelMap modelMap) 
	{
		ModelAndView mav = new ModelAndView("listOps"); 
		mav.addObject("opportunities",searchOpportunityService.findMatches(searchArea,searchCity,searchState,searchStartDate,searchEndDate,searchDailyHrs));
		return mav;
        
    }
	
	@RequestMapping(value = "/searchOps", method = RequestMethod.GET)
	public ModelAndView  searchOpps(ModelMap model) {
		ModelAndView mav = new ModelAndView("searchOps"); 
		return mav;
	}
		
}
