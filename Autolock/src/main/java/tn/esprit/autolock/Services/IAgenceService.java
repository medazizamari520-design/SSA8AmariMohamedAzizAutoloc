package tn.esprit.autolock.Services;

import tn.esprit.autolock.entities.Agence;

import java.util.List;

public interface IAgenceService {

    Agence ajouterAgence(Agence agence);

    Agence modifierAgence(Agence agence);

    void supprimerAgence(Long id);

    List<Agence> recupererlAgences();

}
