
package tn.esprit.autolock.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolock.entities.Paiment;
import tn.esprit.autolock.Services.IPaimentService;

import java.util.List;

@RestController
@RequestMapping("/Paiment")
@AllArgsConstructor
public class PaimentController {

    private IPaimentService paimentService;

    @PostMapping("/AjouterPaiment")
    public Paiment ajouterPaiment(@RequestBody Paiment paiment) {
        return paimentService.ajouterPaiment(paiment);
    }

    @PutMapping("/modifierPaiment")
    public Paiment modifierPaiment(@RequestBody Paiment paiment) {
        return paimentService.modifierPaiment(paiment);
    }

    @DeleteMapping("/supprimerPaiment/{id}")
    public void supprimerPaiment(@PathVariable Long id) {
        paimentService.supprimerPaiment(id);
    }

    @GetMapping("/getPaiments")
    public List<Paiment> afficherPaiments() {
        return paimentService.recupererPaiments();
    }
}
