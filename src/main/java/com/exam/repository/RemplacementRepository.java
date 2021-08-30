package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.entities.Remplacement;

@Repository
public interface RemplacementRepository extends JpaRepository<Remplacement, String> {

}
