package tn.esprit.autolock.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolock.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
