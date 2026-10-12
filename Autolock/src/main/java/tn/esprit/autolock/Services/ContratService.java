package tn.esprit.autolock.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolock.Repositories.ContratRepository;
import tn.esprit.autolock.entities.Contrat;

import java.util.List;
@Service
@AllArgsConstructor
public class ContratService implements IContratService{
    private ContratRepository contratRepo;
    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepo.save(contrat);
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        return contratRepo.save(contrat);
    }

    @Override
    public void supprimerContrat(Long id) {
        contratRepo.deleteById(id);

    }

    @Override
    public List<Contrat> recupererContrats() {
        return contratRepo.findAll();
    }
}
