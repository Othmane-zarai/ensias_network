package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User_login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String username;
	private String mot_passe;
	
	@Transient
	private String mot_passe_confirmation;

	public User_login(long id, String username, String mot_passe, String mot_passe_confirmation) {
		super();
		this.id = id;
		this.username = username;
		this.mot_passe = mot_passe;
		this.mot_passe_confirmation = mot_passe_confirmation;
	}
	public User_login(String username) {
		this.username=username;
	}
	public User_login() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public  String getUsername() {
		return username;
	}

	public void setMail(String username) {
		this.username = username;
	}

	public String getMot_passe() {
		return mot_passe;
	}

	public void setMot_passe(String mot_passe) {
		this.mot_passe = mot_passe;
	}

	public String getMot_passe_confirmation() {
		return mot_passe_confirmation;
	}

	public void setMot_passe_confirmation(String mot_passe_confirmation) {
		this.mot_passe_confirmation = mot_passe_confirmation;
	}
}
