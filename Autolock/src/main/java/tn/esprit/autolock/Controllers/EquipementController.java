package tn.esprit.autolock.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolock.entities.Equipement;
import tn.esprit.autolock.Services.IEquipementService;

import java.util.List;

@RestController
@RequestMapping("/Equipement")
@AllArgsConstructor
public class EquipementController {

    private IEquipementService equipementService;

    @PostMapping("/AjouterEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementService.ajouterEquipement(equipement);
    }

    @PutMapping("/modifierEquipement")
    public Equipement modifierEquipement(@RequestBody Equipement equipement) {
        return equipementService.modifierEquipement(equipement);
    }

    @DeleteMapping("/supprimerEquipement/{id}")
    public void supprimerEquipement(@PathVariable Long id) {
        equipementService.supprimerEquipement(id);
    }

    @GetMapping("/getEquipements")
    public List<Equipement> afficherEquipements() {
        return equipementService.recupererEquipements();
    }

}