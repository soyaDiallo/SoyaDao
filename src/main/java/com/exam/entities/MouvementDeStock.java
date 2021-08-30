package com.exam.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MouvementDeStock 
{
	@Id
	int numero_magasin;
	int quantite;
	Date periode;
	@Column(length = 6)
	String type;// entree ou sortie
	
	@ManyToOne
	@JoinColumn(name = "reference")
	Article reference;
}
