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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tfi.vp.entity.Opportunities;
import com.tfi.vp.service.ListOpportunityService;

@RestController

public class ListOpsController {

	@Resource 
	ListOpportunityService opportunityService;
	
	@RequestMapping(value = "/listOps", method = RequestMethod.GET)
	public ModelAndView  listAllOpps(ModelMap model) {
		ModelAndView mav = new ModelAndView("listOps"); 
		mav.addObject("opportunities",opportunityService.findAll());
		return mav;
	}
	
	
	/*
	 * @PostMapping(value = "/createEmp") public void createEmployee(@RequestBody
	 * Opportunities emp) { employeeService.insertEmployee(emp);
	 * 
	 * }
	 * 
	 * @PutMapping(value = "/updateEmp") public void updateEmployee(@RequestBody
	 * Opportunities emp) { employeeService.updateEmployee(emp);
	 * 
	 * }
	 * 
	 * @PutMapping(value = "/executeUpdateEmp") public void
	 * executeUpdateEmployee(@RequestBody Opportunities emp) {
	 * employeeService.executeUpdateEmployee(emp);
	 * 
	 * }
	 * 
	 * @DeleteMapping(value = "/deleteEmpById") public void
	 * deleteEmployee(@RequestBody Opportunities emp) {
	 * employeeService.deleteEmployee(emp);
	 * 
	 * }
	 */
	
	
}
