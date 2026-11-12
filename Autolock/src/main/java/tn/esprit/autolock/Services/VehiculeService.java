package tn.esprit.autolock.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autolock.Repositories.AgenceRepository;
import tn.esprit.autolock.Repositories.EquipementRepository;
import tn.esprit.autolock.Repositories.VehiculeRepository;
import tn.esprit.autolock.entities.Agence;
import tn.esprit.autolock.entities.Equipement;
import tn.esprit.autolock.entities.Vehicule;

import java.util.List;

@AllArgsConstructor
@Service
public class VehiculeService implements IVehiculeService {

    private VehiculeRepository vehiculeRepo;
    private AgenceRepository agenceRepo;
    private EquipementRepository equipementRepo;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }

    @Override
    public Vehicule modifierVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }

    @Override
    public void supprimerVehicule(Long id) {
        vehiculeRepo.deleteById(id);
    }

    @Override
    public List<Vehicule> recupererVehicules() {
        return vehiculeRepo.findAll();
    }

    @Override
    @Transactional
    public Vehicule affecterVehiculeAAgence(Long idVehicule, Long idAgence) {
        Vehicule vehicule = vehiculeRepo.findById(idVehicule)
                .orElseThrow(() -> new EntityNotFoundException("Vehicule introuvable : " + idVehicule));
        Agence agence = agenceRepo.findById(idAgence)
                .orElseThrow(() -> new EntityNotFoundException("Agence introuvable : " + idAgence));
        vehicule.setAgence(agence);
        return vehiculeRepo.save(vehicule);
    }

    @Override
    @Transactional
    public Vehicule desaffecterVehiculeDeAgence(Long idVehicule) {
        Vehicule vehicule = vehiculeRepo.findById(idVehicule)
                .orElseThrow(() -> new EntityNotFoundException("Vehicule introuvable : " + idVehicule));
        vehicule.setAgence(null);
        return vehiculeRepo.save(vehicule);
    }

    @Override
    @Transactional
    public Vehicule affecterEquipementAVehicule(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepo.findById(idVehicule)
                .orElseThrow(() -> new EntityNotFoundException("Vehicule introuvable : " + idVehicule));
        Equipement equipement = equipementRepo.findById(idEquipement)
                .orElseThrow(() -> new EntityNotFoundException("Equipement introuvable : " + idEquipement));
        vehicule.getEquipements().add(equipement);
        return vehiculeRepo.save(vehicule);
    }

    @Override
    @Transactional
    public Vehicule desaffecterEquipementDeVehicule(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepo.findById(idVehicule)
                .orElseThrow(() -> new EntityNotFoundException("Vehicule introuvable : " + idVehicule));
        vehicule.getEquipements().removeIf(e -> e.getIdEquipement().equals(idEquipement));
        return vehiculeRepo.save(vehicule);
    }
}
