package ch.bbw.dk.ProjektAuftrag.repository;

import ch.bbw.dk.ProjektAuftrag.model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface GymRepository extends JpaRepository<Gym, Integer> {
}
