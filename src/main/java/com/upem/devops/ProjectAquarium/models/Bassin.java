package com.upem.devops.ProjectAquarium.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bassin {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int idBassin;
	  private int capaciteMaxHabitants;
	  private double volumeEau;
	  private String etat;
	  private int idResponsable;
	  private int idSecteur;
	  
	public Bassin() {
		// TODO Auto-generated constructor stub
	}

	public Bassin(int idBassin, int capaciteMaxHabitants, double volumeEau, String etat, int idResponsable,
			int idSecteur) {
		super();
		this.idBassin = idBassin;
		this.capaciteMaxHabitants = capaciteMaxHabitants;
		this.volumeEau = volumeEau;
		this.etat = etat;
		this.idResponsable = idResponsable;
		this.idSecteur = idSecteur;
	}

	public int getIdBassin() {
		return idBassin;
	}

	public void setIdBassin(int idBassin) {
		this.idBassin = idBassin;
	}

	public int getCapaciteMaxHabitants() {
		return capaciteMaxHabitants;
	}

	public void setCapaciteMaxHabitants(int capaciteMaxHabitants) {
		this.capaciteMaxHabitants = capaciteMaxHabitants;
	}

	public double getVolumeEau() {
		return volumeEau;
	}

	public void setVolumeEau(double volumeEau) {
		this.volumeEau = volumeEau;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public int getIdResponsable() {
		return idResponsable;
	}

	public void setIdResponsable(int idResponsable) {
		this.idResponsable = idResponsable;
	}

	public int getIdSecteur() {
		return idSecteur;
	}

	public void setIdSecteur(int idSecteur) {
		this.idSecteur = idSecteur;
	}

	@Override
	public String toString() {
		return "Bassin [idBassin=" + idBassin + ", capaciteMaxHabitants=" + capaciteMaxHabitants + ", volumeEau="
				+ volumeEau + ", etat=" + etat + ", idResponsable=" + idResponsable + ", idSecteur=" + idSecteur + "]";
	}
	
	
}
