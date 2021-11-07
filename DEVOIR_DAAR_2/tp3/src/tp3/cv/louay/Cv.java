package tp3.cv.louay;

import java.util.ArrayList;

public class Cv {
	
	private String prenom;
	
	private String nom;
	private String addresse;
	private String mail;
	private String numero;
	private ArrayList<String> competences;
	private ArrayList<String> langues;
	private ArrayList<String> formations;
	private ArrayList<String> centres_interets;
	private String cvtxt;
	
	public Cv(String prenom, String nom, String addresse,String mail, String numero, ArrayList<String> competences, ArrayList<String> langues,
			ArrayList<String> formations,ArrayList<String> centres_interets) {
		this.prenom = prenom;
		this.nom = nom;
		this.addresse = addresse;
		this.mail = mail;
		this.numero = numero;
		this.competences = competences;
		this.langues = langues;
		this.formations = formations;
		this.centres_interets = centres_interets;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public String getCvTxt() {
		return cvtxt;
	}
	public String getNom() {
		return nom;
	}
	public String getAddresse() {
		return addresse;
	}
	
	public ArrayList<String> getCompetences() {
		return competences;
	}
	
	public ArrayList<String> getLangues() {
		return langues;
	}
	public ArrayList<String> getFormations() {
		return formations;
	}
	public ArrayList<String> getCentreInteret() {
		return centres_interets;
	}
	
	public String toString() {
		return("prenom : "+prenom+"\n"
	+"nom : "+nom+ "\n"
	+"addresse : "+addresse+ "\n"
	+"mail  : "+mail+ "\n"
	+"numero : "+numero+ "\n"
	+"competences : "+competences+ "\n"
	+"langues : "+langues+ "\n"
	+"formations : "+formations+ "\n"
	+"centres d'interets : "+centres_interets+ "\n");
	}
	
	public void setCvtxt(String cvtxt) {
		this.cvtxt = cvtxt;
	}

	
}
