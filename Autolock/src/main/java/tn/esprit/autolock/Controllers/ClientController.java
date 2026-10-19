package tn.esprit.autolock.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolock.entities.Client;
import tn.esprit.autolock.Services.IClientService;

import java.util.List;

@RestController
@RequestMapping("/Client")
@AllArgsConstructor
public class ClientController {

    private IClientService clientService;

    @PostMapping("/AjouterClient")
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @PutMapping("/modifierClient")
    public Client modifierClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }

    @DeleteMapping("/supprimerClient/{id}")
    public void supprimerClient(@PathVariable Long id) {
        clientService.supprimerClient(id);
    }

    @GetMapping("/getClients")
    public List<Client> afficherClients() {
        return clientService.recupererClients();
    }

}