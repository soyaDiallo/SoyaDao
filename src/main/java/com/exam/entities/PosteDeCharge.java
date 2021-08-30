package com.exam.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;

@Entity
@IdClass(PdcId.class)
public class PosteDeCharge  {
	@Id
	int numero_section;
	@Id
	int numero_sous_section;
	@Id
	boolean est_machine; // valeur 0 ou 1
	@Column(length = 2)
	String designation;
	int taux_horaire_ou_forfait;
	int nombre_de_postes;
	int capacite_nominale;
	@Column(length = 2)
	String type_taux_horaire_ou_forfait;
	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "machine_numero_section", fetch = FetchType.LAZY)
//	List<Operation> operations;
//	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "machine_numero_sous_section", fetch = FetchType.LAZY)
//	List<Operation> operations2;
//	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "machine_est_machine", fetch = FetchType.LAZY)
//	List<Operation> operations3;

}
