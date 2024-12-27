package projetPatients.ma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetPatients.ma.entities.Caregiver;
import projetPatients.ma.services.CaregiverService;

import java.util.List;

@RestController
@RequestMapping("/api/caregivers")
@CrossOrigin(origins = "*") // Permettre l'accès cross-origin (optionnel selon les besoins)
public class CaregiverController {

    @Autowired
    private CaregiverService caregiverService;

    // Endpoint pour ajouter un nouveau caregiver
    @PostMapping
    public ResponseEntity<Caregiver> createCaregiver(@RequestBody Caregiver caregiver) {
        return ResponseEntity.ok(caregiverService.saveCaregiver(caregiver));
    }

    // Endpoint pour récupérer un caregiver par ID
    @GetMapping("/{id}")
    public ResponseEntity<Caregiver> getCaregiverById(@PathVariable int id) {
        return caregiverService.getCaregiverById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Endpoint pour récupérer tous les caregivers
    @GetMapping
    public ResponseEntity<List<Caregiver>> getAllCaregivers() {
        return ResponseEntity.ok(caregiverService.getAllCaregivers());
    }

    // Endpoint pour supprimer un caregiver
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCaregiver(@PathVariable int id) {
        caregiverService.deleteCaregiver(id);
        return ResponseEntity.noContent().build();
    }

    // Endpoint pour trouver un caregiver par email
    @GetMapping("/email/{email}")
    public ResponseEntity<Caregiver> getCaregiverByEmail(@PathVariable String email) {
        Caregiver caregiver = caregiverService.getCaregiverByEmail(email);
        if (caregiver != null) {
            return ResponseEntity.ok(caregiver);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
