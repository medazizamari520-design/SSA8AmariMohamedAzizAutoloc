package tn.esprit.autolock.Services;

import tn.esprit.autolock.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);

    Contrat modifierContrat(Contrat contrat);

    void supprimerContrat(Long id);

    List<Contrat> recupererContrats();
}
