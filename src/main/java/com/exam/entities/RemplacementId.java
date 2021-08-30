package com.exam.entities;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

public class RemplacementId implements Serializable 
{
	LienNomenclature remplace_compose;
	LienNomenclature remplace_composant;
	public RemplacementId(LienNomenclature remplace_compose, LienNomenclature remplace_composant) {
		super();
		this.remplace_compose = remplace_compose;
		this.remplace_composant = remplace_composant;
	}
	public RemplacementId() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((remplace_composant == null) ? 0 : remplace_composant.hashCode());
		result = prime * result + ((remplace_compose == null) ? 0 : remplace_compose.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RemplacementId other = (RemplacementId) obj;
		if (remplace_composant == null) {
			if (other.remplace_composant != null)
				return false;
		} else if (!remplace_composant.equals(other.remplace_composant))
			return false;
		if (remplace_compose == null) {
			if (other.remplace_compose != null)
				return false;
		} else if (!remplace_compose.equals(other.remplace_compose))
			return false;
		return true;
	}
	
	
}
