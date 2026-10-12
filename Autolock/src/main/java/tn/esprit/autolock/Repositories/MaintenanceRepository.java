package tn.esprit.autolock.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolock.entities.Maintenance;
@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
