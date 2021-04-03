package com.tfi.vp.service;

import java.util.List;

import com.tfi.vp.entity.Opportunities;

public interface CreateOpportunityService {

	
	boolean validateLogin(String volEmail, String volPassword);

	boolean saveNewOpportunity(String oppTitle, String oppStartDate, String oppEndDate, String oppDailyHrs,
			String oppArea, String oppCity, String oppState, String oppCreator, String oppDesc);
	
	
}
