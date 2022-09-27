package com.devshil.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.devshil.Repositories.LeadReapository;
import com.devshil.entities.Lead;
@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadReapository leadRepo;

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);

	}

	@Override
	public List<Lead> listLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
