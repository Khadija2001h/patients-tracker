package projetPatients.ma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetPatients.ma.entities.Caregiver;

@Repository
public interface CaregiverRepository extends JpaRepository<Caregiver, Integer> {
    // Méthode pour trouver un caregiver par email
    Caregiver findByEmail(String email);
}
