package com.tfi.vp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tfi.vp.entity.Opportunities;

public class OpportunityRowMapper implements RowMapper<Opportunities> {

	@Override
	public Opportunities mapRow(ResultSet rs, int arg1) throws SQLException {
		Opportunities opp = new Opportunities();
		opp.setOppId(rs.getString("oppId"));
		opp.setOppTitle(rs.getString("oppTitle"));
		opp.setOppDescription(rs.getString("oppDescription"));
		opp.setOppStartDate(rs.getString("oppStartDate"));
		opp.setOppEndDate(rs.getString("oppEndDate"));
		opp.setOppDailyHrs(rs.getString("oppDailyHrs"));
		opp.setOppLocationArea(rs.getString("oppLocationArea"));
		opp.setOppLocationCity(rs.getString("oppLocationCity"));
		opp.setOppLocationState(rs.getString("oppLocationState"));
		opp.setOppCreatorEmail(rs.getString("oppCreatorEmail"));
		return opp;
	}
	

}
