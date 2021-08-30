package com.exam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entities.Operation;
import com.exam.repository.OperationRepository;

@Service
public class OperationService {
	
	@Autowired
	OperationRepository operationRepository;
	
	public List<Operation> getAllOperation(){
		return operationRepository.findAll();
	}
	
	public Operation addOperation(Operation operation) {
		return operationRepository.save(operation);
	}
	
	public Operation updateOperation(Operation operation) {
		return operationRepository.save(operation);
	}
	
	public Optional<Operation> getOperationById(int id) {
		return operationRepository.findById(id);
	}
	
	public void deleteOperation(int id) {
		operationRepository.deleteById(id);
	}

}
