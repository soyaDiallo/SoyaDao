package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.entities.LienNomenclature;

@Repository
public interface LienNomenclatureRepository extends JpaRepository<LienNomenclature, String> {

}
