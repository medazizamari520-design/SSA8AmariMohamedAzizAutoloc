package tn.esprit.autolock.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolock.entities.Employe;
@Repository
public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
