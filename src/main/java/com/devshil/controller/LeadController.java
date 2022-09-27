package com.devshil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devshil.dto.LeadDate;
import com.devshil.entities.Lead;
import com.devshil.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/firstpage")
	public String viewCreateLeadPage() {
		return"Create_Lead";
	}
	@RequestMapping("/saveLead")
    public String saveOneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
						//		System.out.println(lead.getFirstName());
						//		System.out.println(lead.getLastName());
						//		System.out.println(lead.getAdd());
						//		System.out.println(lead.getEmail());
						//		System.out.println(lead.getMobile());
	model.addAttribute("msg", "Lead is saved");
	leadService.saveLead(lead);
	return"Create_Lead";
    }
					//	@RequestMapping("/saveLead")
					//	public String saveOneLead(LeadDate data,ModelMap model) {
					//		
					//		Lead lead = new Lead();
					//		
					//		lead.setFirstName(data.getFirstName());
					//		lead.setLastName(data.getLastName());
					//		lead.setAdd(data.getAdd());
					//		lead.setEmail(data.getEmail());
					//		lead.setMobile(data.getMobile());
					//		
					//		leadService.saveLead(lead);
					//		model.addAttribute("msg", "leads save by using dto class");
					//		return "Create_Lead";
					//	}
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.listLeads();
        model.addAttribute("leads", leads);
		return "lead_search_result";
	}

}
