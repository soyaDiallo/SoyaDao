package com.exam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entities.LienNomenclature;
import com.exam.repository.LienNomenclatureRepository;

@Service
public class LienNomenclatureService 
{
	
	@Autowired
	LienNomenclatureRepository lienNomenclatureRepository;
	
	public List<LienNomenclature> getAllLien(){
		return lienNomenclatureRepository.findAll();
	}
	
	public LienNomenclature addLien(LienNomenclature lien) {
		return lienNomenclatureRepository.save(lien);
		
	}
	
	public LienNomenclature updateLien(LienNomenclature lien) {
		return lienNomenclatureRepository.save(lien);
		
	}
	
	public Optional<LienNomenclature> getLienByID(String id) {
		return lienNomenclatureRepository.findById(id);
	}
	
	public void deleteLien(String id) {
		lienNomenclatureRepository.deleteById(id);
	}
}
