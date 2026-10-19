package tn.esprit.autolock.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolock.entities.Contrat;
import tn.esprit.autolock.Services.IContratService;

import java.util.List;

@RestController
@RequestMapping("/Contrat")
@AllArgsConstructor
public class ContratController {

    private IContratService contratService;

    @PostMapping("/AjouterContrat")
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }

    @PutMapping("/modifierContrat")
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }

    @DeleteMapping("/supprimerContrat/{id}")
    public void supprimerContrat(@PathVariable Long id) {
        contratService.supprimerContrat(id);
    }

    @GetMapping("/getContrats")
    public List<Contrat> afficherContrats() {
        return contratService.recupererContrats();
    }

}