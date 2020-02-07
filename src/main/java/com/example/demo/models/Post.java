package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="post")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String contenu;
	private String fichier;
	private int nbre_like;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public String getFichier() {
		return fichier;
	}
	public void setFichier(String fichier) {
		this.fichier = fichier;
	}
	public int getNbre_like() {
		return nbre_like;
	}
	public void setNbre_like(int nbre_like) {
		this.nbre_like = nbre_like;
	}
	public Post(long id, String contenu, String fichier, int nbre_like) {
		super();
		this.id = id;
		this.contenu = contenu;
		this.fichier = fichier;
		this.nbre_like = nbre_like;
	}
	public Post() {
		
	}
	
}
