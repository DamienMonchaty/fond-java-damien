package fr.formation.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.formation.models.Etudiant;
import fr.formation.services.IService;

public class EtudiantServiceImpl implements IService<Etudiant> {

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
    public List<Etudiant> afficher() {
        return etudiants;
    }

    @Override
    public Etudiant enregistrer(Etudiant o) {
        etudiants.add(o);
        return o;
    }
}
