package com.tfi.vp.dao;

import java.util.List;

import com.tfi.vp.entity.Opportunities;

public interface OpportunityDao {

	List<Opportunities> findAll();
	
	List<Opportunities> findMatches(String area, String searchCity, String searchState, String searchStartDate, String searchEndDate, String searchDailyHrs);

	boolean saveNewOpportunity(String oppTitle, String oppStartDate, String oppEndDate, String oppDailyHrs,
			String oppArea, String oppCity, String oppState, String oppCreator, String oppDesc);

	String findOppCreatorById(String oppId);
	
	
}
