package com.upem.devops.ProjectAquarium.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Espece {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int idEspece;
	  private String type;  // genre d'especes
	  private String sexe;
	  private int esperancedevie;
	  private String regimeAlimentaire;
	  private int niveauDeMenace;
	  
	public Espece() {

	}

	public Espece(int idEspece, String type, String sexe, int esperancedevie, String regimeAlimentaire,
			int niveauDeMenace) {
		super();
		this.idEspece = idEspece;
		this.type = type;
		this.sexe = sexe;
		this.esperancedevie = esperancedevie;
		this.regimeAlimentaire = regimeAlimentaire;
		this.niveauDeMenace = niveauDeMenace;
	}

	public int getIdEspece() {
		return idEspece;
	}

	public void setIdEspece(int idEspece) {
		this.idEspece = idEspece;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getEsperancedevie() {
		return esperancedevie;
	}

	public void setEsperancedevie(int esperancedevie) {
		this.esperancedevie = esperancedevie;
	}

	public String getRegimeAlimentaire() {
		return regimeAlimentaire;
	}

	public void setRegimeAlimentaire(String regimeAlimentaire) {
		this.regimeAlimentaire = regimeAlimentaire;
	}

	public int getNiveauDeMenace() {
		return niveauDeMenace;
	}

	public void setNiveauDeMenace(int niveauDeMenace) {
		this.niveauDeMenace = niveauDeMenace;
	}

	@Override
	public String toString() {
		return "Espece [idEspece=" + idEspece + ", type=" + type + ", sexe=" + sexe + ", esperancedevie="
				+ esperancedevie + ", regimeAlimentaire=" + regimeAlimentaire + ", niveauDeMenace=" + niveauDeMenace
				+ "]";
	}
	
	
	
}
