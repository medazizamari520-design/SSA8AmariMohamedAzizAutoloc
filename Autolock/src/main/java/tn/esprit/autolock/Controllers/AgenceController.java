package tn.esprit.autolock.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolock.entities.Agence;
import tn.esprit.autolock.Services.IAgenceService;

import java.util.List;

@RestController
@RequestMapping("/Agence")
@AllArgsConstructor
public class AgenceController {

    private  IAgenceService agenceService;

    @PostMapping("/AjouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence) {
        return agenceService.modifierAgence(agence);
    }

    @DeleteMapping("/supprimerAgence/{id}")
    public void supprimerAgence(@PathVariable Long id) {
        agenceService.supprimerAgence(id);
    }

    @GetMapping("/getAgences")
    public List<Agence> afficherAgences() {
        return agenceService.recupererlAgences();
    }

}