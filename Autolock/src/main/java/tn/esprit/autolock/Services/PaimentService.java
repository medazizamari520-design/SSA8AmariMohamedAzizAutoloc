package tn.esprit.autolock.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolock.Repositories.PaimentRepository;
import tn.esprit.autolock.entities.Paiment;

import java.util.List;

@AllArgsConstructor
@Service
public class PaimentService implements IPaimentService {

    private PaimentRepository paimentRepo;

    @Override
    public Paiment ajouterPaiment(Paiment paiment) {
        return paimentRepo.save(paiment);
    }

    @Override
    public Paiment modifierPaiment(Paiment paiment) {
        return paimentRepo.save(paiment);
    }

    @Override
    public void supprimerPaiment(Long id) {
        paimentRepo.deleteById(id);
    }

    @Override
    public List<Paiment> recupererPaiments() {
        return paimentRepo.findAll();
    }
}