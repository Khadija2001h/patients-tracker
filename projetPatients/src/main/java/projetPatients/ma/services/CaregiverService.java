package projetPatients.ma.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetPatients.ma.entities.Caregiver;
import projetPatients.ma.repositories.CaregiverRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CaregiverService {

    @Autowired
    private CaregiverRepository caregiverRepository;

    // Ajouter un nouveau caregiver
    public Caregiver saveCaregiver(Caregiver caregiver) {
        return caregiverRepository.save(caregiver);
    }

    // Récupérer un caregiver par ID
    public Optional<Caregiver> getCaregiverById(int id) {
        return caregiverRepository.findById(id);
    }

    // Récupérer tous les caregivers
    public List<Caregiver> getAllCaregivers() {
        return caregiverRepository.findAll();
    }

    // Supprimer un caregiver
    public void deleteCaregiver(int id) {
        caregiverRepository.deleteById(id);
    }

    // Trouver un caregiver par email
    public Caregiver getCaregiverByEmail(String email) {
        return caregiverRepository.findByEmail(email);
    }
}
