package com.tfi.vp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.tfi.vp.dao.OpportunityDao;
import com.tfi.vp.entity.Opportunities;
@Component
public class ListOpportunityServiceImpl implements ListOpportunityService{
	@Resource 
	OpportunityDao opportunityDao;
	
	@Override
	public List<Opportunities> findAll() {
		return opportunityDao.findAll();
	}
	/*
	 * @Override public void insertEmployee(Opportunities emp) {
	 * employeeDao.insertEmployee(emp);
	 * 
	 * }
	 * 
	 * @Override public void updateEmployee(Opportunities emp) {
	 * employeeDao.updateEmployee(emp);
	 * 
	 * }
	 * 
	 * @Override public void executeUpdateEmployee(Opportunities emp) {
	 * employeeDao.executeUpdateEmployee(emp);
	 * 
	 * }
	 * 
	 * @Override public void deleteEmployee(Opportunities emp) {
	 * employeeDao.deleteEmployee(emp);
	 * 
	 * }
	 */
}
