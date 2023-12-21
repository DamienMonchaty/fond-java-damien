package fr.formation.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import fr.formation.models.Enseignant;
import fr.formation.models.Etudiant;
import fr.formation.models.Personne;
import fr.formation.models.Voiture;
import fr.formation.services.impl.EtudiantServiceImpl;

public class App {
    public static void main(String[] args) {

        // getFond();
        // Personne p1 = new Personne("LEGRIS", "GANDALF", 2000);

        // System.out.println(p1.getPrenom());
        // p1.afficher();
        // System.out.println(p1);

        // Personne p2 = new Personne();
        // p2.setNom("LEBLANC");
        // p2.setPrenom("SAROUMANE");
        // p2.setAge(2200);

        // System.out.println(p2.getPrenom());
        // p2.afficher();
        // System.out.println(p2);

        // Personne p3 = new Personne("SACQUET", "FRODON", 15);
        // System.out.println(p3);

        // Exercice :
        // Creer une classe voiture avec les proprietes suivantes :
        // marque, modele, couleur
        // Creer un tableau de 5 voitures et les afficher
        // Un tableau en java, c'est statique -> taile fixe
        Voiture[] voitures = new Voiture[] {
                new Voiture("MARQUE1", "MODELE1", "COULEUR1"),
                new Voiture("MARQUE2", "MODELE2", "COULEUR2"),
                new Voiture("MARQUE3", "MODELE3", "COULEUR3"),
                new Voiture("MARQUE4", "MODELE4", "COULEUR4"),
                new Voiture("MARQUE5", "MODELE5", "COULEUR5"),
        };

        // Une collection, c'est dynamique, on va pouvoir modifier cette collection
        // indefiniment
        // en gros, une collection n'a pas de taille fixe
        List<Voiture> voituresList = new ArrayList<Voiture>();
        voituresList.add(new Voiture("MARQUE1", "MODELE1", "COULEUR1"));
        voituresList.add(new Voiture("MARQUE2", "MODELE2", "COULEUR1"));
        voituresList.add(new Voiture("MARQUE3", "MODELE3", "COULEUR1"));

        System.out.println("----------------------------------------");

        System.out.println(voituresList.get(0));

        System.out.println("----------------------------------------");

        Arrays.asList(voitures).forEach((v) -> System.out.println(v));

        System.out.println("----------------------------------------");

        // Java 8
        voituresList.forEach((v) -> System.out.println(v));

        List<String> strings = new ArrayList<String>();
        strings.add("str1");
        strings.add("str2");
        strings.add("str3");
        strings.forEach((s) -> System.out.println(s));

        // Personne p4 = new Personne("LEGRIS", "GANDALF", 2000, voituresList);

        // System.out.println("----------------------------------------");

        // p4.getVoitures().forEach((v) -> System.out.println(v));

        // System.out.println("----------------------------------------");

        // boolean test = p4.add(new Voiture("MARQUE4", "MODELE4", "COULEUR4"));

        // if (test == true)
        // System.out.println("Nouvelle voiture inserée");

        // p4.getVoitures().forEach((v) -> System.out.println(v));

        // System.out.println(p4);

        System.out.println("----------------------------------------");

        Etudiant e1 = new Etudiant("NOMETU1", "PRENOMETU1", 20, voituresList, "Licence");

        System.out.println(e1);

        System.out.println("----------------------------------------");

        e1.afficher();
        e1.getDetails();

        System.out.println("----------------------------------------");

        e1.getVoitures().forEach((v) -> System.out.println(v));

        Enseignant ens1 = new Enseignant("NOMENS1", "PRENOMENS1", 50, voituresList, 2500.50);

        System.out.println(ens1);

        System.out.println("----------------------------------------");

        ens1.afficher();
        ens1.getDetails();

        System.out.println("----------------------------------------");

        Personne personnes[] = { e1, ens1 };

        for (Personne elt : personnes) {
            System.out.println(elt);
        }

        System.out.println("----------------------------------------");

        EtudiantServiceImpl etudiantServiceImpl = new EtudiantServiceImpl();

        List<Etudiant> etudiantsList = etudiantServiceImpl.afficherEtudiants();

        for (Etudiant etudiant : etudiantsList) {
            System.out.println(etudiant);
        }

        System.out.println("----------------------------------------");

        etudiantServiceImpl.enregistrerEtudiant(new Etudiant("NOM4", "PRENOM4", 20, "MASTER2"));

        etudiantsList = etudiantServiceImpl.afficherEtudiants();

        for (Etudiant etudiant : etudiantsList) {
            System.out.println(etudiant);
        }
    }

    private static void getFond() {
        // Les types objets offrent plusieurs methodes a appliquer sur les
        // valeurs : conversion, nombre de caractere...
        int a = 1;
        Integer b = a; // auto-boxing
        System.out.println(b);

        Integer z = 2;
        int y = z;
        System.out.println(y); // unboxing

        double k = 150.2d;
        Double j = k;
        System.out.println(j);

        String str = "Salut tout le monde";
        System.out.println(str);

        // Retourne la longueur de la chaine
        int charNumber = str.length();
        System.out.println(charNumber);

        // Retourne le caractère a l'indice 3
        System.out.println(str.charAt(3));

        // Retourne la chaine a partir de l'indice passe en parametre
        System.out.println(str.substring(6));

        // Remplace toutes les occurrences de 'e' par 'z'
        System.out.println(str.replace("e", "z"));

        // Convertit la chaîne en majuscules
        System.out.println(str.toUpperCase());

        // Convertit la chaîne en minuscules
        System.out.println(str.toLowerCase());

        // Vérifie si la chaîne contient "Salut"
        System.out.println(str.contains("Salut"));

        System.out.println("-------------------------------------------------------------");

        // Conversion d'un int - Integer en String

        // Casting en un type compatible
        int number1 = 3;
        String str2 = ((Integer) number1).toString();
        System.out.println(str2);

        str2 = Integer.toString(number1);
        System.out.println(str2);

        str2 = String.valueOf(number1);
        System.out.println(str2);

        System.out.println("-------------------------------------------------------------");

        int arr[] = { 5, 7, -8, 5, 14, 1 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("-------------------------------------------------------------");

        // Écrire un programme Java pour convertir des minutes en un certain nombre
        // d'années et de jours

        // Nombre total de minutes dans une année (365 jours)
        double minutesInYear = 60 * 24 * 365;

        // Nombre de minutes à convertir
        double min = 330000000;

        // Calcul du nombre d'années en divisant le nombre total de minutes par le
        // nombre de minutes dans une année
        long years = (long) (min / minutesInYear);

        // Calcul du nombre de jours en prenant le reste de la division par le nombre de
        // minutes dans une journée
        int days = (int) (min / 60 / 24) % 365;

        // Affichage du résultat
        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");

        System.out.println("-------------------------------------------------------------");

        String str3 = "Salut";
        String str4 = " tout le monde";

        System.out.println(str3 + str4);
        System.out.printf("%S%s \n", str3, str4);

        // String nom = "Wick";
        // int age = 50;
        // System.out.printf("Bonjour, je m'appelle %S et j'ai %d ans ou plus ! \n",
        // nom, age);

        System.out.println("-------------------------------------------------------------");

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Veuillez saisir votre nom, svp ?");
        String nom = scanner1.nextLine();

        System.out.println("Veuillez saisir votre âge, svp ?");
        int age = scanner1.nextInt();

        System.out.printf("Nom : %s, Age : %d \n", nom, age);

        System.out.print("Entrer un nombre : ");
        float n = scanner1.nextFloat();

        System.out.print("Entrer un autre nombre : ");
        float m = scanner1.nextFloat();

        System.out.println("Le produit de " + m + " et " + n + " est " + n * m);

        System.out.println("-------------------------------------------------------------");

        // Demandez trois nombres de l'utilisateur et affichez le plus grand nombre.
        System.out.print("Entrer un premier nombre : ");
        int n1 = scanner1.nextInt();

        System.out.print("Entrer un deuxieme nombre : ");
        int n2 = scanner1.nextInt();

        System.out.print("Entrer un troisieme nombre : ");
        int n3 = scanner1.nextInt();

        // 1ere version
        int plusGrandNombre = Math.max(Math.max(n1, n2), n3);

        // Affichage du résultat
        System.out.println("Le plus grand nombre parmi " + n1 + ", " + n2 + " et " + n3 + " est : " + plusGrandNombre);

        // scanner1.close();

        // 2eme version if
        double plusGrandNombre2;

        if (n1 >= n2 && n1 >= n3) {
            plusGrandNombre2 = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            plusGrandNombre2 = n2;
        } else {
            plusGrandNombre2 = n3;
        }

        System.out.println("Le plus grand nombre parmi " + n1 + ", " + n2 + " et " + n3 + " est : " + plusGrandNombre2);

        // 3eme version if
        if (n1 > n2)
            if (n1 > n3)
                System.out.println("The greatest: " + n1);
        if (n2 > n3)
            if (n2 > n3)
                System.out.println("The greatest: " + n2);
        if (n3 > n1)
            if (n3 > n1)
                System.out.println("The greatest: " + n3);

        System.out.println("-------------------------------------------------------------");

        int x = 5;
        switch (x) {
            case 1:
                System.out.println("un");
                break;
            case 2:
                System.out.println("deux");
                break;
            case 3:
                System.out.println("trois");
                break;
            default:
                System.out.println("autre");
        }

        // java 12 : Pattern matching
        int jourSemaine = 3;
        String jourType = switch (jourSemaine) {
            case 1, 2, 3, 4, 5 -> "Jour Ouvrable";
            case 6, 7 -> "WE";
            default -> "Jour Invalide";
        };
        System.out.println(jourType);

        String jour = "Lundi";
        String resultat = switch (jour) {
            case "Lundi" -> "C'est le premier jour de la semaine";
            case "Mardi" -> "C'est le deuxieme jour de la semaine";
            default -> "Jour Invalide";
        };
        System.out.println(resultat);

        System.out.println("-------------------------------------------------------------");

        String type = (x % 2 == 0) ? "pair" : "impair";
        System.out.println(type);

        System.out.println("-------------------------------------------------------------");

        // Tableau Statique
        int[] tab = new int[2]; // Precise ici une taille fixe de deux elements
        tab[0] = 2;
        tab[1] = 5;
        // tab[2] = 6;

        System.out.println(tab[0]); // 2
        System.out.println(tab[1]); // 5
        // System.out.println(tab[2]); // Error IndexOutArrayOfBound

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
