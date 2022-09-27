package com.devshil.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devshil.entities.Lead;

public interface LeadReapository extends JpaRepository<Lead, Long> {

}
