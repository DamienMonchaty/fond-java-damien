package fr.formation.services;

import java.util.List;

import fr.formation.models.Etudiant;

// CRUD - CREATE - READ - UPDATE - DELETE
public interface IEtudiantService {
    
    List<Etudiant> afficherEtudiants();
    Etudiant enregistrerEtudiant(Etudiant etudiant);
}
