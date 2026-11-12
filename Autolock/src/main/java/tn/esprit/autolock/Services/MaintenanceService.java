package tn.esprit.autolock.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autolock.Repositories.MaintenanceRepository;
import tn.esprit.autolock.Repositories.VehiculeRepository;
import tn.esprit.autolock.entities.Maintenance;
import tn.esprit.autolock.entities.Vehicule;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService {
    private MaintenanceRepository maintenanceRepo;
    private VehiculeRepository vehiculeRepo;

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

    @Override
    @Transactional
    public Maintenance affecterMaintenanceAVehicule(Long idMaintenance, Long idVehicule) {
        Maintenance maintenance = maintenanceRepo.findById(idMaintenance)
                .orElseThrow(() -> new EntityNotFoundException("Maintenance introuvable : " + idMaintenance));
        Vehicule vehicule = vehiculeRepo.findById(idVehicule)
                .orElseThrow(() -> new EntityNotFoundException("Vehicule introuvable : " + idVehicule));
        maintenance.setVehicule(vehicule);
        return maintenanceRepo.save(maintenance);
    }

    @Override
    @Transactional
    public Maintenance desaffecterMaintenanceDeVehicule(Long idMaintenance) {
        Maintenance maintenance = maintenanceRepo.findById(idMaintenance)
                .orElseThrow(() -> new EntityNotFoundException("Maintenance introuvable : " + idMaintenance));
        maintenance.setVehicule(null);
        return maintenanceRepo.save(maintenance);
    }
}
