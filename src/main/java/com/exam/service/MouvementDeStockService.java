package com.exam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entities.MouvementDeStock;
import com.exam.repository.MouvementDeStockRepository;

@Service
public class MouvementDeStockService 
{
	@Autowired
	MouvementDeStockRepository deStockRepository;
	
	
	public List<MouvementDeStock> getAllMouvement(){
		return deStockRepository.findAll();
	}
	
	public MouvementDeStock addMouvement(MouvementDeStock ms) {
		return deStockRepository.save(ms);
	}
	
	public MouvementDeStock updateMouvement(MouvementDeStock ms) {
		return deStockRepository.save(ms);
	}
	
	public Optional<MouvementDeStock> getMouvementById(int id) {
		return deStockRepository.findById(id);
	}
	
	public void deleteMouvement(int id) {
		deStockRepository.deleteById(id);
	}

}
