package com.exam.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entities.Article;
import com.exam.entities.PosteDeCharge;
import com.exam.service.PosteDeChargeService;

@RestController
public class PosteDeChargeController 
{
	@Autowired 
	PosteDeChargeService service;
	
	@GetMapping("/postes")
	public List<PosteDeCharge> getAll()
	{
		return service.getAllCharge();
	}
	
	@PostMapping("/postes")
	public PosteDeCharge add(PosteDeCharge charge) {
		return service.addCharge(charge);
	}
	
	@DeleteMapping("/postes/{id}")
	public void delete(@PathVariable int id)
	{
		service.deleteCharge(id);
	}
	
	@GetMapping("/postes/{id}")
	public Optional<PosteDeCharge> get(@PathVariable int i)
	{
		return service.getChargeById(i);
	}
	
	@PutMapping("/postes/{id}")
	public ResponseEntity<PosteDeCharge> update(@PathVariable int id,@RequestBody PosteDeCharge pc)
	{
		Optional<PosteDeCharge> poste = service.getChargeById(id);
		if(poste.isPresent())
		{
			return new ResponseEntity<> (service.updateCharge(pc),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
