package fr.formation.models;

import java.util.List;

public class Enseignant extends Personne {

    private double salaire;

    public Enseignant(double salaire) {
        this.salaire = salaire;
    }

    public Enseignant(String nom, String prenom, int age, double salaire) {
        super(nom, prenom, age);
        this.salaire = salaire;
    }

    public Enseignant(String nom, String prenom, int age, List<Voiture> voitures, double salaire) {
        super(nom, prenom, age, voitures);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(this.salaire);
    }

    @Override
    public String toString() {
        return super.toString() +  "Enseignant [salaire=" + salaire + "]";
    }

    @Override
    public void getDetails() {
        System.out.println(this.nom + "aime noel !");
    }
}
