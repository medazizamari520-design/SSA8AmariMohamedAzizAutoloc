package tn.esprit.autolock.Services;

import tn.esprit.autolock.entities.Paiment;

import java.util.List;

public interface IPaimentService {

    Paiment ajouterPaiment(Paiment paiment);

    Paiment modifierPaiment(Paiment paiment);

    void supprimerPaiment(Long id);

    List<Paiment> recupererPaiments();
}