package tn.esprit.autolock.Services;

import tn.esprit.autolock.entities.Client;

import java.util.List;

public interface IClientService {
    Client ajouterClient(Client client);
    Client modifierClient(Client client);
    void supprimerClient(Long id);
    List<Client> recupererClients();
}
