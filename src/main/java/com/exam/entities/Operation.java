package com.exam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class Operation 
{
	@Id
	int numero_operation;
	int temps_preparation;
	int temps_execution;
	int temps_transfert;
	int libelle_operation;
	
//	@ManyToOne
//	@JoinColumns({ @JoinColumn(name = "machine_numero_section"), @JoinColumn(name = "main_d_oeuvre_numero_section") })
//	PosteDeCharge machine_numero_section;
//	
//	@ManyToOne
//	@JoinColumns({@JoinColumn(name = "machine_numero_sous_section"),@JoinColumn(name = "main_d_oeuvre_numero_sous_section") })
//	PosteDeCharge machine_numero_sous_section;
//	
//	@ManyToOne
//	@JoinColumns({@JoinColumn(name = "machine_est_machine"),@JoinColumn(name = "main_d_oeuvre_est_machine") })
//	PosteDeCharge machine_est_machine;

}
