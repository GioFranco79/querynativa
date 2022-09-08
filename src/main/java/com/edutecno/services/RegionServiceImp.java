package com.edutecno.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.model.Region;
import com.edutecno.repository.RegionRepository;

@Service
public class RegionServiceImp implements RegionService {
	@Autowired
	private RegionRepository regionRepo;
	
	@Override
	public List<Region> findAll() {		
		return regionRepo.findAll();
	}
}
