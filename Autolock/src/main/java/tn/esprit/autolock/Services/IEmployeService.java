package tn.esprit.autolock.Services;

import tn.esprit.autolock.entities.Employe;

import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe employe);

    Employe modifierEmploye(Employe employe);

    void supprimerEmploye(Long id);

    List<Employe> recupererEmployes();
}
