package com.tfi.vp.dao;

import java.util.List;

import com.tfi.vp.entity.Opportunities;

public interface VolunteerDao {

	boolean registerVolunteer(String vol_email, String vol_mobile, String vol_avail, String vol_reason,
			String oppId);
	
	boolean validateRegistration(String vol_email,String oppId);
	
}
