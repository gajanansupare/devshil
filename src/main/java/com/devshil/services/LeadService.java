package com.devshil.services;

import java.util.List;

import com.devshil.entities.Lead;

public interface LeadService {
	public void saveLead(Lead lead);

	public List<Lead> listLeads();

}
