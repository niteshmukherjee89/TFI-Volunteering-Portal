package com.tfi.vp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.tfi.vp.dao.OpportunityDao;
import com.tfi.vp.dao.VolunteerDao;
import com.tfi.vp.entity.Opportunities;
@Component
public class CreateOpportunityServiceImpl implements CreateOpportunityService{
	@Resource 
	OpportunityDao opportunityDao;

	

	@Override
	public boolean validateLogin(String volEmail, String volPassword) {
		//Hardcoded currently. Later on this can be encrypted and stored in Database.
		if(volEmail.equalsIgnoreCase("admin")&&volPassword.equalsIgnoreCase("admin"))
			return true;
		else
			return false;
	}



	@Override
	public boolean saveNewOpportunity(String oppTitle, String oppStartDate, String oppEndDate, String oppDailyHrs,
			String oppArea, String oppCity, String oppState, String oppCreator,String oppDesc) {
		if(opportunityDao.saveNewOpportunity(oppTitle, oppStartDate, oppEndDate,  oppDailyHrs,
				 oppArea,  oppCity,  oppState,  oppCreator,oppDesc))
			return true;
		else
			return false;
	}

	
}
