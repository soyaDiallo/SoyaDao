package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entities.Remplacement;
import com.exam.repository.RemplacementRepository;

@Service
public class RemplacementService 
{
	@Autowired
	RemplacementRepository remplacementRepository;
	
	public List<Remplacement> getAllRemplacement(){
		return remplacementRepository.findAll();
	}
	
	public Remplacement addRemplacement(Remplacement remplacement) {
		return remplacementRepository.save(remplacement);
	}
	
	public Remplacement updateRemplacement(Remplacement remplacement) {
		return remplacementRepository.save(remplacement);
	}
	
	public Remplacement getRemplacementById(String id) {
		return remplacementRepository.getById(id);
	}
	
	public void deleteRemplacement(String id) {
		remplacementRepository.deleteById(id);
	}

}
