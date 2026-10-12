package tn.esprit.autolock.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolock.entities.Agence;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long> {
}
