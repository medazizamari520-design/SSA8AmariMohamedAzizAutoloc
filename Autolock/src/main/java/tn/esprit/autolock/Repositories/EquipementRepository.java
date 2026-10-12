package tn.esprit.autolock.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolock.entities.Equipement;
@Repository
public interface EquipementRepository extends JpaRepository<Equipement,Long> {
}
