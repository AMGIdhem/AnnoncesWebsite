package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Annonce {
	@Id
	@GeneratedValue
	private Long id;
	private String adresse;
	private String titre;
	private double prix;
	private String tel;
	private String description;
	private String photo;
	private String photo1;
	private String photo2;
	private String etage;
	private String meuble;
	private float surface;
	private int nombrePersonnes;
	@ManyToOne
	private User user;
	@ManyToOne 
	TypeLogement typeLogement;
	@ManyToOne
	Quartier quartier;
	
	public Annonce() {
		
	}
	
	

	public String getEtage() {
		return etage;
	}



	public void setEtage(String etage) {
		this.etage = etage;
	}



	public String getMeuble() {
		return meuble;
	}



	public void setMeuble(String meuble) {
		this.meuble = meuble;
	}



	public float getSurface() {
		return surface;
	}



	public void setSurface(float surface) {
		this.surface = surface;
	}



	public int getNombrePersonnes() {
		return nombrePersonnes;
	}



	public void setNombrePersonnes(int nombrePersonnes) {
		this.nombrePersonnes = nombrePersonnes;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getPhoto1() {
		return photo1;
	}

	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	public String getPhoto2() {
		return photo2;
	}

	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}

	public TypeLogement getTypeLogement() {
		return typeLogement;
	}

	public void setTypeLogement(TypeLogement typeLogement) {
		this.typeLogement = typeLogement;
	}

	public Quartier getQuartier() {
		return quartier;
	}

	public void setQuartier(Quartier quartier) {
		this.quartier = quartier;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
