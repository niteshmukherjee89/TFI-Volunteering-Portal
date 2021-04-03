package com.tfi.vp.service;

import java.util.List;

import com.tfi.vp.entity.Opportunities;

public interface RegisterOpportunityService {

	boolean validateRegistration(String vol_email, String oppId);
	boolean registerVolunteer(String vol_email, String vol_mobile, String vol_avail, String vol_reason, String oppId);
	
	
}
