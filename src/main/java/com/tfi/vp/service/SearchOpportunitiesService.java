package com.tfi.vp.service;

import java.util.List;

import com.tfi.vp.entity.Opportunities;

public interface SearchOpportunitiesService {

	List<Opportunities> findMatches(String searchArea, String searchCity, String searchState, String searchStartDate,
			String searchEndDate, String searchDailyHrs);
	
	
}
