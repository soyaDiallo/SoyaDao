package com.exam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entities.PosteDeCharge;
import com.exam.repository.PosteDeChargeRepository;

@Service
public class PosteDeChargeService 
{
	@Autowired
	PosteDeChargeRepository chargeRepository;
	
	public List<PosteDeCharge> getAllCharge()
	{
		return chargeRepository.findAll();
	}
	
	public PosteDeCharge addCharge(PosteDeCharge charge) {
		return chargeRepository.save(charge);
	}
	
	public PosteDeCharge updateCharge(PosteDeCharge charge) {
		return chargeRepository.save(charge);
	}
	
	public Optional<PosteDeCharge> getChargeById(int id) {
		return chargeRepository.findById(id);
	}
	
	public void deleteCharge(int id) {
		chargeRepository.deleteById(id);
		
	}
}
