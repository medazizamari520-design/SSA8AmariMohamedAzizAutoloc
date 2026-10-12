package tn.esprit.autolock.Services;

import tn.esprit.autolock.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    Maintenance ajouterMaintenance(Maintenance maintenance);

    Maintenance modifierMaintenance(Maintenance maintenance);

    void supprimerMaintenance(Long id);

    List<Maintenance> recupererMaintenances();
}