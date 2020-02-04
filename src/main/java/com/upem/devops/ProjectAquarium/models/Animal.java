package com.upem.devops.ProjectAquarium.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Animal {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int idAnimal;
	  private String nom;
	  private String sexe;
	  private String signeDistinctif;
	  @OneToOne(targetEntity=Date.class)
	  private Date dateArrivee;
	  @OneToOne(targetEntity=Date.class)
	  private Date dateDepartPossible;
	  private int idEspece;
	  private int idBassin;
	  
	public Animal() {

	}
	  
	public Animal(int idAnimal, String nom, String sexe, String signeDistinctif, Date dateArrivee,
			Date dateDepartPossible, int idEspece, int idBassin) {
		super();
		this.idAnimal = idAnimal;
		this.nom = nom;
		this.sexe = sexe;
		this.signeDistinctif = signeDistinctif;
		this.dateArrivee = dateArrivee;
		this.dateDepartPossible = dateDepartPossible;
		this.idEspece = idEspece;
		this.idBassin = idBassin;
	}

	public int getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getSigneDistinctif() {
		return signeDistinctif;
	}

	public void setSigneDistinctif(String signeDistinctif) {
		this.signeDistinctif = signeDistinctif;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Date getDateDepartPossible() {
		return dateDepartPossible;
	}

	public void setDateDepartPossible(Date dateDepartPossible) {
		this.dateDepartPossible = dateDepartPossible;
	}

	public int getIdEspece() {
		return idEspece;
	}

	public void setIdEspece(int idEspece) {
		this.idEspece = idEspece;
	}

	public int getIdBassin() {
		return idBassin;
	}

	public void setIdBassin(int idBassin) {
		this.idBassin = idBassin;
	}

	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", nom=" + nom + ", sexe=" + sexe + ", signeDistinctif="
				+ signeDistinctif + ", dateArrivee=" + dateArrivee + ", dateDepartPossible=" + dateDepartPossible
				+ ", idEspece=" + idEspece + ", idBassin=" + idBassin + "]";
	}
	   
	  
}
