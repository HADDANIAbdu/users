package web;

public class utilisateur {
	private static int ID = 0;
	private int num;
	private String nom;
	private String prenom;
	private String email;
	private int age;
	public utilisateur(String nom, String prenom, String email, int age) {
		utilisateur.ID++;
		this.num = utilisateur.ID;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.age = age;
	}
	public int getnum() {
		return num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
