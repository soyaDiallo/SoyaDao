package com.exam.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LnKey implements Serializable {
	@Column(name = "compose")
	String compose;
	
	@Column(name = "composant")
	String composant;

	public LnKey() {
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
		LnKey other = (LnKey) obj;
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

	public String getCompose() {
		return compose;
	}

	public void setCompose(String compose) {
		this.compose = compose;
	}

	public String getComposant() {
		return composant;
	}

	public void setComposant(String composant) {
		this.composant = composant;
	}

	
}
