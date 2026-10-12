package tn.esprit.autolock.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolock.entities.Contrat;
@Repository
public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
