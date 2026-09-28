package com.project.back_end.controllers;
import com.project.back_end.services.DoctorService;
import com.project.back_end.services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private ValidationService validationService;
    @GetMapping
    public ResponseEntity<Map<String, Object>> getDoctors() {
        Map<String, Object> response = Map.of("doctors", doctorService.getDoctors());
        return ResponseEntity.ok(response);
    }
    @GetMapping("/availability/{user}/{doctorId}/{date}/{token}")
    public ResponseEntity<Map<String, Object>> getDoctorAvailability(
            @PathVariable String user, @PathVariable Long doctorId,
            @PathVariable String date, @PathVariable String token) {
        return ResponseEntity.ok(Map.of("availability", doctorService.getDoctorAvailability(doctorId, java.time.LocalDate.parse(date))));
    }
}
