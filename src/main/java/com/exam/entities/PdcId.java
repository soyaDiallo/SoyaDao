package com.exam.entities;

import java.io.Serializable;

import javax.persistence.Id;

public class PdcId implements Serializable {

	int numero_section;
	int numero_sous_section;
	boolean est_machine;

	public PdcId(int numero_section, int numero_sous_section, boolean est_machine) {
		super();
		this.numero_section = numero_section;
		this.numero_sous_section = numero_sous_section;
		this.est_machine = est_machine;
	}

	public PdcId() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (est_machine ? 1231 : 1237);
		result = prime * result + numero_section;
		result = prime * result + numero_sous_section;
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
		PdcId other = (PdcId) obj;
		if (est_machine != other.est_machine)
			return false;
		if (numero_section != other.numero_section)
			return false;
		if (numero_sous_section != other.numero_sous_section)
			return false;
		return true;
	}

}
