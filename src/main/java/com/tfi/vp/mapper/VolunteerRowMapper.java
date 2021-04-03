package com.tfi.vp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tfi.vp.entity.Opportunities;
import com.tfi.vp.entity.Volunteer;

public class VolunteerRowMapper implements RowMapper<Volunteer> {

	@Override
	public Volunteer mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Volunteer vol= new Volunteer();
		vol.setOppId(rs.getString("oppId"));
		vol.setVolEmail(rs.getString("volEmail"));
		vol.setVolMobile(rs.getString("volMobile"));
		vol.setVolHrs(rs.getString("volHrs"));
		vol.setVolReason(rs.getString("volReason"));
		
		return vol;
	}
	

}
