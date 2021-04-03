package com.tfi.vp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.tfi.vp.dao.OpportunityDao;
import com.tfi.vp.entity.Opportunities;
@Component
public class SearchOpportunitiesServiceImpl implements SearchOpportunitiesService{
	@Resource 
	OpportunityDao opportunityDao;
	
	@Override
	public List<Opportunities> findMatches(String searchArea, String searchCity, String searchState,
			String searchStartDate, String searchEndDate, String searchDailyHrs) {
		return opportunityDao.findMatches(searchArea,searchCity,searchState,searchStartDate,searchEndDate,searchDailyHrs);
	
	}

	
}
