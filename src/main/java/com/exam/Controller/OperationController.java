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
import com.exam.entities.Operation;
import com.exam.service.OperationService;

@RestController
public class OperationController 
{
	@Autowired
	OperationService operationService;
	
	@GetMapping("/operations")
	public List<Operation> getAll(){
		return operationService.getAllOperation();
	}
	
	@PostMapping("operations")
	public Operation addOperation(@RequestBody Operation operation) {
		return operationService.addOperation(operation);
	}
	
	@GetMapping("/operations/{id}")
	public Optional<Operation> get(@PathVariable int id) {
		return operationService.getOperationById(id);
	}
	
	@DeleteMapping("/operations/{id}")
	public void delete(@PathVariable int id) {
		operationService.deleteOperation(id);
	}
	
	@PutMapping("/operations/{id}")
	public ResponseEntity<Operation> update(@PathVariable int id,@RequestBody Operation o)
	{
		Optional<Operation> operation = operationService.getOperationById(id);
		if(operation.isPresent())
		{
			return new ResponseEntity<> (operationService.updateOperation(o),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
