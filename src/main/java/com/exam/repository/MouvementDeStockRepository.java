package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.entities.MouvementDeStock;

@Repository
public interface MouvementDeStockRepository extends JpaRepository<MouvementDeStock, Integer> {

}
