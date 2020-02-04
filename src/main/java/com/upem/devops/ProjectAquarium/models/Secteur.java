package com.upem.devops.ProjectAquarium.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Secteur {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int idSecteur;
	  private String nom;
	  private String localisationDansAquarium;
	  
	public Secteur() {
	
	}

	public Secteur(int idSecteur, String nom, String localisationDansAquarium) {
		super();
		this.idSecteur = idSecteur;
		this.nom = nom;
		this.localisationDansAquarium = localisationDansAquarium;
	}

	public int getIdSecteur() {
		return idSecteur;
	}

	public void setIdSecteur(int idSecteur) {
		this.idSecteur = idSecteur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLocalisationDansAquarium() {
		return localisationDansAquarium;
	}

	public void setLocalisationDansAquarium(String localisationDansAquarium) {
		this.localisationDansAquarium = localisationDansAquarium;
	}

	@Override
	public String toString() {
		return "Secteur [idSecteur=" + idSecteur + ", nom=" + nom + ", localisationDansAquarium="
				+ localisationDansAquarium + "]";
	}
	
	
}
