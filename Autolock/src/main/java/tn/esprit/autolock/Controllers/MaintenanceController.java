package tn.esprit.autolock.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolock.entities.Maintenance;
import tn.esprit.autolock.Services.IMaintenanceService;

import java.util.List;

@RestController
@RequestMapping("/Maintenance")
@AllArgsConstructor
public class MaintenanceController {

    private IMaintenanceService maintenanceService;

    @PostMapping("/AjouterMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.ajouterMaintenance(maintenance);
    }

    @PutMapping("/modifierMaintenance")
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.modifierMaintenance(maintenance);
    }

    @DeleteMapping("/supprimerMaintenance/{id}")
    public void supprimerMaintenance(@PathVariable Long id) {
        maintenanceService.supprimerMaintenance(id);
    }

    @GetMapping("/getMaintenances")
    public List<Maintenance> afficherMaintenances() {
        return maintenanceService.recupererMaintenances();
    }

    @PutMapping("/affecterMaintenanceAVehicule/{idMaintenance}/{idVehicule}")
    public Maintenance affecterMaintenanceAVehicule(@PathVariable Long idMaintenance, @PathVariable Long idVehicule) {
        return maintenanceService.affecterMaintenanceAVehicule(idMaintenance, idVehicule);
    }

    @PutMapping("/desaffecterMaintenanceDeVehicule/{idMaintenance}")
    public Maintenance desaffecterMaintenanceDeVehicule(@PathVariable Long idMaintenance) {
        return maintenanceService.desaffecterMaintenanceDeVehicule(idMaintenance);
    }

}
