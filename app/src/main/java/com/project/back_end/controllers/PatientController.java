package com.project.back_end.controllers;
import com.project.back_end.dto.Login;
import com.project.back_end.models.Patient;
import com.project.back_end.services.PatientService;
import com.project.back_end.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired private PatientService patientService;
    @Autowired private Service validationService;
    @PostMapping
    public ResponseEntity<Map<String, String>> createPatient(@RequestBody Patient patient) {
        int result = patientService.createPatient(patient);
        if (result == 1) return ResponseEntity.ok(Map.of("message", "Signup successful"));
        return ResponseEntity.status(500).body(Map.of("message", "Internal server error"));
    }
    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> patientLogin(@RequestBody Login login) {
        return validationService.validatePatientLogin(login);
    }
}
