package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.entities.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Integer> {

}
