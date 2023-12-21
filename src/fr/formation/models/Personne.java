package fr.formation.models;

import java.util.List;

import fr.formation.inter.IMiseEnForme;

// POJO : PLain Old Java Object
// doit avoir des attributs en private
// doit avoir un contructeur vide 
// puis au moins un constructeur plein
// doit avoir des getters - setters 
// pour donner acces a nos attributs en private
// et sa methode toString()
public abstract class Personne implements IMiseEnForme {

    protected int id;
    protected String nom;
    protected String prenom;
    protected int age;
    protected List<Voiture> voitures;
    // Une propriete declarée en static est partagees
    // entre toutes les objets de type Personne
    private static int count;

    public Personne() {
        this.id = ++count;
    }

    public Personne(String nom, String prenom, int age) {
        this.id = ++count;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Personne(String nom, String prenom, int age, List<Voiture> voitures) {
        this.id = ++count;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.voitures = voitures;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }

    public void afficher() {
        System.out.print(this.id + " " + this.prenom + " " + this.nom + " " + this.age + " ");
    }

    @Override
    public String toString() {
        return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", voitures=" + voitures
                + "]";
    }

    public boolean add(Voiture e) {
        return voitures.add(e);
    }

    // Une methode abstraite est une methode non implementee
    // Elle le sera obligatoirement dans les classes filles selon leur contexte
    public abstract void getDetails();

    // Une methode finale ne pourra pas etre redefinit dans des classes enfants 
    public final void afficherNomComplet(){
        System.out.println(this.nom + " " + this.prenom);
    }

    @Override
    public void afficherNomMajuscule() {
        System.out.println(this.nom.toUpperCase());
    }

    @Override
    public void afficherPrenomMajuscule() {
       System.out.println(this.prenom.toUpperCase());
    }
}
