package com.exam.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
@IdClass(RemplacementId.class)
public class Remplacement {
	@Id
	@ManyToOne
	@JoinColumns({@JoinColumn(name = "remplace_compose"),@JoinColumn(name = "remplacant_compose")})
	LienNomenclature remplace_compose;

	@Id
	@ManyToOne
	@JoinColumns({@JoinColumn(name = "remplace_composant"),@JoinColumn(name = "remplacant_composant")})
	LienNomenclature remplace_composant;

	Date date_de_remplacement;

	public Remplacement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LienNomenclature getRemplace_compose() {
		return remplace_compose;
	}

	public void setRemplace_compose(LienNomenclature remplace_compose) {
		this.remplace_compose = remplace_compose;
	}

	public LienNomenclature getRemplace_composant() {
		return remplace_composant;
	}

	public void setRemplace_composant(LienNomenclature remplace_composant) {
		this.remplace_composant = remplace_composant;
	}

	public Date getDate_de_remplacement() {
		return date_de_remplacement;
	}

	public void setDate_de_remplacement(Date date_de_remplacement) {
		this.date_de_remplacement = date_de_remplacement;
	}

}
