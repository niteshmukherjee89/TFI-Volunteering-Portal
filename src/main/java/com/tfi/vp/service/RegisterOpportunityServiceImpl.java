package com.tfi.vp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.tfi.vp.dao.OpportunityDao;
import com.tfi.vp.dao.VolunteerDao;
import com.tfi.vp.entity.Opportunities;
import com.tfi.vp.service.RegisterOpportunityService;

@Component
public class RegisterOpportunityServiceImpl implements RegisterOpportunityService{
	
	@Resource 
	VolunteerDao volunteerDao;

	@Resource 
	OpportunityDao opportunityDao;

	@Autowired
    private JavaMailSender javaMailSender;
	
	@Override
	public boolean registerVolunteer(String vol_email, String vol_mobile, String vol_avail,
			String vol_reason, String oppId) {
		
		if(validateRegistration(vol_email,oppId))
		{
			if(volunteerDao.registerVolunteer(vol_email,vol_mobile,vol_avail,vol_reason,oppId))
			{	
				sendEmailToCreator(vol_email,vol_mobile,vol_avail,vol_reason,oppId);
				return true;
			}
			else
			return false; //Something went wrong inserting volunteer details
		}
		else
		{
			//The volunteer is already registered for this OppId
			return false;
		}
	}


	@Override
	public boolean validateRegistration(String vol_email, String oppId) {
	
		return volunteerDao.validateRegistration(vol_email, oppId);
	}
	
	public void sendEmailToCreator(String volunteerEmail,String volunteerMobile,String volunteerAvailability,String volunteerReason,String oppId)
	{
			String creatorEmail=opportunityDao.findOppCreatorById(oppId);
			if(creatorEmail!=null && creatorEmail.length()>0)
			{
			SimpleMailMessage msg = new SimpleMailMessage();
		    msg.setTo(creatorEmail);
		    String creatorName=creatorEmail.substring(0, creatorEmail.indexOf("@"));
		    msg.setSubject("New Registration for Opportunity# "+oppId);
		    msg.setText("Dear "+creatorName+",\n"
		    		+ "There's a new registration done for your opportunity. Please review the candidature and accept/reject accordingly."
		    		+ "\n #Volunteer Email ID:"+ volunteerEmail
		    		+ "\n #Volunteer Mobile:"+ volunteerMobile
		    		+ "\n #Daily Availability:"+ volunteerAvailability
		    		+ "\n #Reason to Volunteer:"+ volunteerReason);
	        javaMailSender.send(msg);
			}
	}
	
}
