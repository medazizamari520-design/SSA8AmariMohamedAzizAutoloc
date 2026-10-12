package tn.esprit.autolock.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolock.Repositories.EmployeRepository;
import tn.esprit.autolock.entities.Employe;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService{
    private EmployeRepository employeRepo;
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
}
