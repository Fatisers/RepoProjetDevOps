package com.upem.devops.ProjectAquarium.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.StringTokenizer;

@Entity
public class Activite {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int idActivite;
	  private String jour;
	  private String nom;
	  private String heureDebut;
	  private String heureFin;
	  private String publiqueOuPrivee;
	  private int idBassin;
	  private int idEmploye;

	  
	public Activite() {

	}

	public Activite(int idActivite, String jour, String nom, String heureDebut, String heureFin, String publiqueOuPrivee, int idBassin, int idEmploye) {
		this.idActivite = idActivite;
		this.jour = jour;
		this.nom = nom;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.publiqueOuPrivee = publiqueOuPrivee;
		this.idBassin = idBassin;
		this.idEmploye = idEmploye;
	}

	public int getIdActivite() {
		return idActivite;
	}

	public void setIdActivite(int idActivite) {
		this.idActivite = idActivite;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		StringTokenizer st = new StringTokenizer(jour,"-");
		String year = st.nextToken();
		String month = st.nextToken();
		char[] d= st.nextToken().toCharArray();
		String day = d[0]+""+d[1];
		String result = day+"/"+month+"/"+year;
		this.jour = result;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}

	public String getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}

	public String getPubliqueOuPrivee() {
		return publiqueOuPrivee;
	}

	public void setPubliqueOuPrivee(String publiqueOuPrivee) {
		this.publiqueOuPrivee = publiqueOuPrivee;
	}

	public int getIdBassin() {
		return idBassin;
	}

	public void setIdBassin(int idBassin) {
		this.idBassin = idBassin;
	}

	public int getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}



	@Override
	public String toString() {
		return "Activite [idActivite=" + idActivite + ", jour=" + jour + ", nom=" + nom + ", heureDebut=" + heureDebut
				+ ", heureFin=" + heureFin + ", publiqueOuPrivee=" + publiqueOuPrivee + ", idBassin=" + idBassin
				+ ", idEmploye=" + idEmploye + "]";
	}
	
	
	  
	  
}
