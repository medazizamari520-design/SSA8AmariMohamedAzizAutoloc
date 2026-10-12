package tn.esprit.autolock.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolock.Repositories.MaintenanceRepository;
import tn.esprit.autolock.entities.Maintenance;

import java.util.List;
@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService{
    private MaintenanceRepository maintenanceRepo;

    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }

    @Override
    public Maintenance modifierMaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }

    @Override
    public void supprimerMaintenance(Long id) {
        maintenanceRepo.deleteById(id);
    }

    @Override
    public List<Maintenance> recupererMaintenances() {
        return maintenanceRepo.findAll();
    }
}