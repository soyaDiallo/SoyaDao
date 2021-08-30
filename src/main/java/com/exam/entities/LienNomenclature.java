package com.exam.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

@Entity
@IdClass(LnId.class)
public class LienNomenclature {

//	@EmbeddedId
//	LnKey id;
//	
	@Id
	@ManyToOne
	//@MapsId("compose")
	@JoinColumn(name = "compose")
	Article compose;

	@Id
	@ManyToOne
	//@MapsId("composant")
	@JoinColumn(name = "composant")
	Article composant;

	int quantite_de_composition;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "remplace_compose", fetch = FetchType.LAZY)
	List<Remplacement> rcompose;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "remplace_composant", fetch = FetchType.LAZY)
	List<Remplacement> rcomposant;

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	

	public LienNomenclature(Article compose, Article composant, int quantite_de_composition) {
		super();
		this.compose = compose;
		this.composant = composant;
		this.quantite_de_composition = quantite_de_composition;
	}

	public Article getCompose() {
		return compose;
	}

	public void setCompose(Article compose) {
		this.compose = compose;
	}

	public Article getComposant() {
		return composant;
	}

	public void setComposant(Article composant) {
		this.composant = composant;
	}

	public int getQuantite_de_composition() {
		return quantite_de_composition;
	}

	public void setQuantite_de_composition(int quantite_de_composition) {
		this.quantite_de_composition = quantite_de_composition;
	}

}
