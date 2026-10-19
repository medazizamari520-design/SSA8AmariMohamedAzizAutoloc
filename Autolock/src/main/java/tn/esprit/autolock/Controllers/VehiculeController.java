package tn.esprit.autolock.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolock.entities.Vehicule;
import tn.esprit.autolock.Services.IVehiculeService;

import java.util.List;

@RestController
@RequestMapping("/Vehicule")
@AllArgsConstructor
public class VehiculeController {

    private IVehiculeService vehiculeService;

    @PostMapping("/AjouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }

    @DeleteMapping("/supprimerVehicule/{id}")
    public void supprimerVehicule(@PathVariable Long id) {
        vehiculeService.supprimerVehicule(id);
    }

    @GetMapping("/getVehicules")
    public List<Vehicule> afficherVehicules() {
        return vehiculeService.recupererVehicules();
    }

}