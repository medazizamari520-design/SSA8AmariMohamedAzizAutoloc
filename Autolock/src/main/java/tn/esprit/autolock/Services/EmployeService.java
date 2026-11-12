package tn.esprit.autolock.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autolock.Repositories.AgenceRepository;
import tn.esprit.autolock.Repositories.EmployeRepository;
import tn.esprit.autolock.entities.Agence;
import tn.esprit.autolock.entities.Employe;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService {
    private EmployeRepository employeRepo;
    private AgenceRepository agenceRepo;

    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepo.save(employe);
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        return employeRepo.save(employe);
    }

    @Override
    public void supprimerEmploye(Long id) {
        employeRepo.deleteById(id);
    }

    @Override
    public List<Employe> recupererEmployes() {
        return employeRepo.findAll();
    }

    @Override
    @Transactional
    public Employe affecterEmployeAAgence(Long idEmploye, Long idAgence) {
        Employe employe = employeRepo.findById(idEmploye)
                .orElseThrow(() -> new EntityNotFoundException("Employe introuvable : " + idEmploye));
        Agence agence = agenceRepo.findById(idAgence)
                .orElseThrow(() -> new EntityNotFoundException("Agence introuvable : " + idAgence));
        employe.setAgence(agence);
        return employeRepo.save(employe);
    }

    @Override
    @Transactional
    public Employe desaffecterEmployeDeAgence(Long idEmploye) {
        Employe employe = employeRepo.findById(idEmploye)
                .orElseThrow(() -> new EntityNotFoundException("Employe introuvable : " + idEmploye));
        employe.setAgence(null);
        return employeRepo.save(employe);
    }
}
