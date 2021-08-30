package com.exam.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Article implements Serializable {
	@Id
	@Column(length = 30)
	String reference;
	@Column(length = 30, unique = true)
	String designation;
	@Column(length = 30)
	String typeFabricationAchat;
	@Column(length = 30)
	String uniteAchatStock;
	int delaiEnSemaine;
	float prixStandard;
	int stockMaxi;
	int stockMini;
	int lotDeReapprovisionnement;
	int inventaire;
	float pourcentage_de_perte;
	@Column(length = 2)
	String PF_ou_MP_ou_Piece_ou_SE;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "compose", fetch = FetchType.LAZY)
	List<LienNomenclature> lncompose;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "composant", fetch = FetchType.LAZY)
	List<LienNomenclature> lncomposant;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "reference", fetch = FetchType.LAZY)
	List<MouvementDeStock> deStocks;

//	public Article(String reference, String designation, String typeFabricationAchat, String uniteAchatStock,
//			int delaiEnSemaine, float prixStandard, int stockMaxi, int stockMini, int lotDeReapprovisionnement,
//			int inventaire, float pourcentage_de_perte, String pF_ou_MP_ou_Piece_ou_SE,
//			List<LienNomenclature> lncompose, List<LienNomenclature> lncomposant) {
//		super();
//		this.reference = reference;
//		this.designation = designation;
//		this.typeFabricationAchat = typeFabricationAchat;
//		this.uniteAchatStock = uniteAchatStock;
//		this.delaiEnSemaine = delaiEnSemaine;
//		this.prixStandard = prixStandard;
//		this.stockMaxi = stockMaxi;
//		this.stockMini = stockMini;
//		this.lotDeReapprovisionnement = lotDeReapprovisionnement;
//		this.inventaire = inventaire;
//		this.pourcentage_de_perte = pourcentage_de_perte;
//		PF_ou_MP_ou_Piece_ou_SE = pF_ou_MP_ou_Piece_ou_SE;
//		this.lncompose = lncompose;
//		this.lncomposant = lncomposant;
//	}

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTypeFabricationAchat() {
		return typeFabricationAchat;
	}

	public void setTypeFabricationAchat(String typeFabricationAchat) {
		this.typeFabricationAchat = typeFabricationAchat;
	}

	public String getUniteAchatStock() {
		return uniteAchatStock;
	}

	public void setUniteAchatStock(String uniteAchatStock) {
		this.uniteAchatStock = uniteAchatStock;
	}

	public int getDelaiEnSemaine() {
		return delaiEnSemaine;
	}

	public void setDelaiEnSemaine(int delaiEnSemaine) {
		this.delaiEnSemaine = delaiEnSemaine;
	}

	public float getPrixStandard() {
		return prixStandard;
	}

	public void setPrixStandard(float prixStandard) {
		this.prixStandard = prixStandard;
	}

	public int getStockMaxi() {
		return stockMaxi;
	}

	public void setStockMaxi(int stockMaxi) {
		this.stockMaxi = stockMaxi;
	}

	public int getStockMini() {
		return stockMini;
	}

	public void setStockMini(int stockMini) {
		this.stockMini = stockMini;
	}

	public int getLotDeReapprovisionnement() {
		return lotDeReapprovisionnement;
	}

	public void setLotDeReapprovisionnement(int lotDeReapprovisionnement) {
		this.lotDeReapprovisionnement = lotDeReapprovisionnement;
	}

	public int getInventaire() {
		return inventaire;
	}

	public void setInventaire(int inventaire) {
		this.inventaire = inventaire;
	}

	public float getPourcentage_de_perte() {
		return pourcentage_de_perte;
	}

	public void setPourcentage_de_perte(float pourcentage_de_perte) {
		this.pourcentage_de_perte = pourcentage_de_perte;
	}

	public String getPF_ou_MP_ou_Piece_ou_SE() {
		return PF_ou_MP_ou_Piece_ou_SE;
	}

	public void setPF_ou_MP_ou_Piece_ou_SE(String pF_ou_MP_ou_Piece_ou_SE) {
		PF_ou_MP_ou_Piece_ou_SE = pF_ou_MP_ou_Piece_ou_SE;
	}

	public List<LienNomenclature> getLncompose() {
		return lncompose;
	}

	public void setLncompose(List<LienNomenclature> lncompose) {
		this.lncompose = lncompose;
	}

	public List<LienNomenclature> getLncomposant() {
		return lncomposant;
	}

	public void setLncomposant(List<LienNomenclature> lncomposant) {
		this.lncomposant = lncomposant;
	}

}
