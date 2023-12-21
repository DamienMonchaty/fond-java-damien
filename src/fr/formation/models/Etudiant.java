package fr.formation.models;

import java.util.List;

public class Etudiant extends Personne {

    private String niveau;

    public Etudiant() {}

    public Etudiant(String nom, String prenom, int age, String niveau) {
        super(nom, prenom, age);
        this.niveau = niveau;
    }

    public Etudiant(String nom, String prenom, int age, List<Voiture> voitures, String niveau) {
        super(nom, prenom, age, voitures);
        this.niveau = niveau;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(this.niveau);
    }

    @Override
    public String toString() {
        return super.toString() + "Etudiant [niveau=" + niveau + "]";
    }

    public void etudier() {
        System.out.println(this.nom.toUpperCase() + " etudie !");
    }

	@Override
	public void getDetails() {
		System.out.println(this.nom + "n'aime pas noel !");
	}

}
