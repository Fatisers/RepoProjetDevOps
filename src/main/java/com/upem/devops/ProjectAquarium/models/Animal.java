package com.upem.devops.ProjectAquarium.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.StringTokenizer;


@Entity
public class Animal {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int idAnimal;
	  private String nom;
	  private String sexe;
	  private String signeDistinctif;
	  private String dateArrivee;
	  private String dateDepartPossible;
	  private int idEspece;
	  private int idBassin;
	  
	public Animal() {

	}

	public Animal(int idAnimal, String nom, String sexe, String signeDistinctif, String dateArrivee, String dateDepartPossible, int idEspece, int idBassin) {
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

	public String getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(String dateArrivee) {
		StringTokenizer st = new StringTokenizer(dateArrivee,"-");
		String year = st.nextToken();
		String month = st.nextToken();
		char[] d= st.nextToken().toCharArray();
		String day = d[0]+""+d[1];
		String result = day+"/"+month+"/"+year;
		this.dateArrivee = result;
	}

	public String getDateDepartPossible() {
		return dateDepartPossible;
	}

	public void setDateDepartPossible(String dateDepartPossible) {
		StringTokenizer st = new StringTokenizer(dateDepartPossible,"-");
		String year = st.nextToken();
		String month = st.nextToken();
		char[] d= st.nextToken().toCharArray();
		String day = d[0]+""+d[1];
		String result = day+"/"+month+"/"+year;
		this.dateDepartPossible = result;
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
		return "Animal{" +
				"idAnimal=" + idAnimal +
				", nom='" + nom + '\'' +
				", sexe='" + sexe + '\'' +
				", signeDistinctif='" + signeDistinctif + '\'' +
				", dateArrivee='" + dateArrivee + '\'' +
				", dateDepartPossible='" + dateDepartPossible + '\'' +
				", idEspece=" + idEspece +
				", idBassin=" + idBassin +
				'}';
	}
}
