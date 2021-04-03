package com.tfi.vp.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.tfi.vp.entity.Opportunities;
import com.tfi.vp.mapper.OpportunityRowMapper;
@Repository
public class OpportunityDaoImpl implements OpportunityDao{
	
	public OpportunityDaoImpl(NamedParameterJdbcTemplate template) {  
        this.template = template;  
}  
	NamedParameterJdbcTemplate template;  

	@Override
	public List<Opportunities> findAll() {
		return template.query("select * from oppDetails", new OpportunityRowMapper());
	}
	
	
	@Override
	public List<Opportunities> findMatches(String searchArea, String searchCity, String searchState, String searchStartDate,
			String searchEndDate, String searchDailyHrs) {
		String finalQuery="select * from oppDetails";
		String tempQuery="";
		//if any of the search criteria is true then use only that for filter
		//else if all are blank then return all results
		if(searchArea!=null && searchArea.length()>0)
			tempQuery+="select * from oppDetails where opplocationArea like '%"+searchArea+"%'";
		
		if(searchCity!=null && searchCity.length()>0)
			if(tempQuery.length()>0)
			tempQuery+="and opplocationCity like '%"+searchCity+"%'";
			else
			tempQuery+="select * from oppDetails where opplocationCity like '%"+searchCity+"%'";
		
		if(searchState!=null && searchState.length()>0)
			if(tempQuery.length()>0)
			tempQuery+="and opplocationState like '%"+searchState+"%'";
			else
			tempQuery+="select * from oppDetails where opplocationState like '%"+searchState+"%'";
				
		if(searchStartDate!=null && searchStartDate.length()>0)
			if(tempQuery.length()>0)
			tempQuery+="and oppstartdate like '%"+searchStartDate+"%'";
			else
				tempQuery+="select * from oppDetails where oppstartdate like '%"+searchStartDate+"%'";
		
		if(searchEndDate!=null && searchEndDate.length()>0)
			if(tempQuery.length()>0)
			tempQuery+="and oppenddate like '%"+searchEndDate+"%'";
			else
				tempQuery+="select * from oppDetails where oppenddate like '%"+searchEndDate+"%'";
		
		if(searchDailyHrs!=null && searchDailyHrs.length()>0)
			if(tempQuery.length()>0)
			tempQuery+="and oppdailyhrs like '%"+searchDailyHrs+"%'";
			else
				tempQuery+="select * from oppDetails where oppdailyhrs like '%"+searchDailyHrs+"%'";
		
		
		if(tempQuery.length()>0)
			finalQuery=tempQuery;
		
		return template.query(finalQuery,new OpportunityRowMapper());
	}


	@Override
	public boolean saveNewOpportunity(String oppTitle, String oppStartDate, String oppEndDate, String oppDailyHrs,
			String oppArea, String oppCity, String oppState, String oppCreator, String oppDesc) {
		
		String query="insert into oppDetails(oppTitle,oppDescription,oppStartDate,oppEndDate,oppDailyHrs,oppLocationArea,oppLocationCity,oppLocationState,oppCreatorEmail) "
				+ " values (:oppTitle,:oppDescription,:oppStartDate,:oppEndDate,:oppDailyHrs,:oppLocationArea,:oppLocationCity,:oppLocationState,:oppCreatorEmail)";
		MapSqlParameterSource params = new MapSqlParameterSource();
		 
		params.addValue("oppTitle", oppTitle)
		      .addValue("oppDescription", oppDesc)
		      .addValue("oppStartDate", oppStartDate)
			  .addValue("oppEndDate", oppEndDate)
			  .addValue("oppDailyHrs", oppDailyHrs)
			  .addValue("oppLocationArea", oppArea)
			  .addValue("oppLocationCity", oppCity)
			  .addValue("oppLocationState", oppState)
			  .addValue("oppCreatorEmail", oppCreator);
			  
		 int updateCount=template.update(query, params);
		if(updateCount>0)
			return true;	
		
		return false;
	}


	@Override
	public String findOppCreatorById(String oppId) {
		String creatorEmail="";
		String query="select * from oppDetails where oppId='"+oppId+"'";
		List<Opportunities> oppIdentified=template.query(query,new OpportunityRowMapper());
		if(oppIdentified!=null)
			creatorEmail=oppIdentified.get(0).getOppCreatorEmail();
		return creatorEmail;
	}

	
}
