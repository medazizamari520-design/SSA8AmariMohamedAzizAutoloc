package tn.esprit.autolock.Services;

import tn.esprit.autolock.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);

    Equipement modifierEquipement(Equipement equipement);

    void supprimerEquipement(Long id);

    List<Equipement> recupererEquipements();
}
