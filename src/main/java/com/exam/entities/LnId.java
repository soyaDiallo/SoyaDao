package com.exam.entities;

import java.io.Serializable;

public class LnId implements Serializable {

	Article compose;
	Article composant;

	public LnId(Article compose, Article composant) {
		super();
		this.compose = compose;
		this.composant = composant;
	}

	public LnId() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((composant == null) ? 0 : composant.hashCode());
		result = prime * result + ((compose == null) ? 0 : compose.hashCode());
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
		LnId other = (LnId) obj;
		if (composant == null) {
			if (other.composant != null)
				return false;
		} else if (!composant.equals(other.composant))
			return false;
		if (compose == null) {
			if (other.compose != null)
				return false;
		} else if (!compose.equals(other.compose))
			return false;
		return true;
	}

}
