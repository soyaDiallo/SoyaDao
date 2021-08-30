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
import com.exam.entities.MouvementDeStock;
import com.exam.service.MouvementDeStockService;

@RestController
public class MouvementDeStockController 
{
	
	@Autowired
	MouvementDeStockService service;
	
	@GetMapping("/stocks")
	public List<MouvementDeStock> getAll(){
		return service.getAllMouvement();
	}
	
	@GetMapping("/stocks/{id}")
	public Optional<MouvementDeStock> get(@PathVariable int id) {
		return service.getMouvementById(id);
	}
	
	@PostMapping("/stocks")
	public MouvementDeStock add(@RequestBody MouvementDeStock stock) {
		return service.addMouvement(stock);
		
	}
	
	@DeleteMapping("/stock/{id}")
	public void delete(@PathVariable int id) {
		service.deleteMouvement(id);
	}
	
	@PutMapping("/stock/{id}")
	public ResponseEntity<MouvementDeStock> update(@PathVariable int id,@RequestBody MouvementDeStock ms)
	{
		Optional<MouvementDeStock> stock = service.getMouvementById(id);
		if(stock.isPresent())
		{
			return new ResponseEntity<> (service.updateMouvement(ms),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
