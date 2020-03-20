package backend.entities;

import org.springframework.data.annotation.Id;

public abstract class Personne {
	@Id
	private String id;
	private String nom; 
	private String email;
	private String motPasse;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotPasse() {
		return motPasse;
	}
	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}
	public Personne(String nom, String email, String motPasse) {
		super();
		this.nom = nom;
		this.email = email;
		this.motPasse = motPasse;
	}
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
