package tn.esprit.autolock.Services;

import tn.esprit.autolock.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule ajouterVehicule(Vehicule vehicule);

    Vehicule modifierVehicule(Vehicule vehicule);

    void supprimerVehicule(Long id);

    List<Vehicule> recupererVehicules();
}