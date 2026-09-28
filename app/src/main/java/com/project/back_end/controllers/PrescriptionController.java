package com.project.back_end.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.project.back_end.models.Prescription;
import java.util.Map;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

    @PostMapping("/{token}")
    public ResponseEntity<Map<String, String>> savePrescription(
            @PathVariable String token,
            @RequestBody Prescription prescription) {
        return null;
    }
}
