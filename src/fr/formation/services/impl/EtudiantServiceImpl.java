package fr.formation.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.formation.models.Etudiant;
import fr.formation.services.IEtudiantService;

public class EtudiantServiceImpl implements IEtudiantService {

    private List<Etudiant> etudiants;

    public EtudiantServiceImpl() {
        etudiants = new ArrayList<Etudiant>(
            Arrays.asList(
                new Etudiant("NOM1", "PRENOM1", 20, "MASTER1"),
                new Etudiant("NOM2", "PRENOM2", 20, "MASTER2"),
                new Etudiant("NOM3", "PRENOM3", 20, "MASTER3")
            )
        );
    }

    @Override
    public List<Etudiant> afficherEtudiants() {
       return etudiants;
    }

    @Override
    public Etudiant enregistrerEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }

}
