package com.project.back_end.services;
import com.project.back_end.models.Patient;
import com.project.back_end.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    public int createPatient(Patient patient) {
        try { patientRepository.save(patient); return 1; }
        catch (Exception e) { return 0; }
    }
    public ResponseEntity<Map<String, Object>> getPatientAppointment(Long id, String token) {
        return ResponseEntity.ok(new HashMap<>());
    }
    public ResponseEntity<Map<String, Object>> getPatientDetails(String token) {
        return ResponseEntity.ok(new HashMap<>());
    }
}
