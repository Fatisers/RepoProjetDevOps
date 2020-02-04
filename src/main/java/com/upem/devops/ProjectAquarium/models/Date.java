package com.upem.devops.ProjectAquarium.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Date {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int idDate;
	private int jour;
	private int mois;
	private int annee;
	
	public Date() {
		
	}



	public Date(int idDate, int jour, int mois, int annee) {
		super();
		this.idDate = idDate;
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}



	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return jour + "/" + mois + "/" + annee ;
	}


}
