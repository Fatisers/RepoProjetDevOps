package com.upem.devops.ProjectAquarium.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


@Entity
public class Employe {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int idEmploye;
	  private String nom;
	  private String identifiant;
	  private String motdepasse;
	  private String prenom;
	  private String adresse;
	  private String dateDeNaissance;
	  private String numSecuSociale;
	  private String role;
	  @ManyToMany(targetEntity=Bassin.class)
	  private List<Bassin> listebassins;
	  
	public Employe() {
		// TODO Auto-generated constructor stub
	}

	public Employe(int idEmploye, String nom, String identifiant, String motdepasse, String prenom, String adresse, String dateDeNaissance, String numSecuSociale, String role, List<Bassin> listebassins) {
		this.idEmploye = idEmploye;
		this.nom = nom;
		this.identifiant = identifiant;
		this.motdepasse = motdepasse;
		this.prenom = prenom;
		this.adresse = adresse;
		this.dateDeNaissance = dateDeNaissance;
		this.numSecuSociale = numSecuSociale;
		this.role = role;
		this.listebassins = listebassins;
	}

	public int getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getNumSecuSociale() {
		return numSecuSociale;
	}

	public void setNumSecuSociale(String numSecuSociale) {
		this.numSecuSociale = numSecuSociale;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Bassin> getListebassins() {
		return listebassins;
	}

	public void setListebassins(List<Bassin> listebassins) {
		this.listebassins = listebassins;
	}

	@Override
	public String toString() {
		return "Employe [idEmploye=" + idEmploye + ", nom=" + nom + ", identifiant=" + identifiant + ", motdepasse="
				+ motdepasse + ", prenom=" + prenom + ", adresse=" + adresse + ", dateDeNaissance=" + dateDeNaissance
				+ ", numSecuSociale=" + numSecuSociale + ", role=" + role + ", listebassins=" + listebassins + "]";
	}
	
	

}