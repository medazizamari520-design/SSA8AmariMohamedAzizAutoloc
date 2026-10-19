package tn.esprit.autolock.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolock.entities.Employe;
import tn.esprit.autolock.Services.IEmployeService;

import java.util.List;

@RestController
@RequestMapping("/Employe")
@AllArgsConstructor
public class EmployeController {

    private IEmployeService employeService;

    @PostMapping("/AjouterEmploye")
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.ajouterEmploye(employe);
    }

    @PutMapping("/modifierEmploye")
    public Employe modifierEmploye(@RequestBody Employe employe) {
        return employeService.modifierEmploye(employe);
    }

    @DeleteMapping("/supprimerEmploye/{id}")
    public void supprimerEmploye(@PathVariable Long id) {
        employeService.supprimerEmploye(id);
    }

    @GetMapping("/getEmployes")
    public List<Employe> afficherEmployes() {
        return employeService.recupererEmployes();
    }

}