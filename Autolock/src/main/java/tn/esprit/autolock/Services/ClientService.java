package tn.esprit.autolock.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolock.Repositories.ClientRepository;
import tn.esprit.autolock.entities.Client;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService{
    private ClientRepository clientRepo;
    @Override
    public Client ajouterClient(Client client) {

        return clientRepo.save(client);
    }

    @Override
    public Client modifierClient(Client client) {

        return clientRepo.save(client);
    }

    @Override
    public void supprimerClient(Long id) {
        clientRepo.deleteById(id);

    }

    @Override
    public List<Client> recupererClients() {

        return clientRepo.findAll();
    }
}
