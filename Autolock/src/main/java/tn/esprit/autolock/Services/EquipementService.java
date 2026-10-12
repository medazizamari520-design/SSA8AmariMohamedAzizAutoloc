package tn.esprit.autolock.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolock.Repositories.EquipementRepository;
import tn.esprit.autolock.entities.Equipement;

import java.util.List;

@AllArgsConstructor
@Service
public class EquipementService implements IEquipementService {

    private EquipementRepository equipementRepo;

    @Override
    public Equipement ajouterEquipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }

    @Override
    public Equipement modifierEquipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }

    @Override
    public void supprimerEquipement(Long id) {
        equipementRepo.deleteById(id);
    }

    @Override
    public List<Equipement> recupererEquipements() {
        return equipementRepo.findAll();
    }
}