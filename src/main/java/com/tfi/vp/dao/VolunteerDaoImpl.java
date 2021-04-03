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
import com.tfi.vp.entity.Volunteer;
import com.tfi.vp.mapper.OpportunityRowMapper;
import com.tfi.vp.mapper.VolunteerRowMapper;
@Repository
public class VolunteerDaoImpl implements VolunteerDao{
	
	public VolunteerDaoImpl(NamedParameterJdbcTemplate template) {  
        this.template = template;  
}  
	NamedParameterJdbcTemplate template;  

	

	@Override
	public boolean registerVolunteer(String vol_email, String vol_mobile, String vol_avail, String vol_reason,
			String oppId) {
		
		String query="insert into volunteerdetails(oppId,volEmail,volMobile,volHrs,volReason) values (:oppId,:vol_email,:vol_mobile,:vol_avail,:vol_reason)";
		MapSqlParameterSource params = new MapSqlParameterSource();
		 
		params.addValue("oppId", oppId)
		      .addValue("vol_email", vol_email)
		      .addValue("vol_mobile", vol_mobile)
			  .addValue("vol_avail", vol_avail)
			  .addValue("vol_reason", vol_reason);
		 int updateCount=template.update(query, params);
		if(updateCount>0)
			return true;	
		
		return false;
	}


	@Override
	public boolean validateRegistration(String vol_email, String oppId) {
		
		List<Volunteer> volList= template.query("select * from volunteerDetails where oppId like '%"+oppId+"%' and volEmail like '%"+vol_email+"%'",new VolunteerRowMapper());
		if(volList!=null && !volList.isEmpty())
			return false;
		else
			return true;
	}

	
	
}
