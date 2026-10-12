package tn.esprit.autolock.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolock.entities.Paiment;
@Repository
public interface PaimentRepository extends JpaRepository<Paiment,Long> {
}
