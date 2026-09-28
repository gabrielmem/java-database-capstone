package com.project.back_end.controllers;
import com.project.back_end.models.Appointment;
import com.project.back_end.services.AppointmentService;
import com.project.back_end.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired private AppointmentService appointmentService;
    @Autowired private Service validationService;
    @PostMapping("/{token}")
    public ResponseEntity<Map<String, String>> bookAppointment(@PathVariable String token, @RequestBody Appointment appointment) {
        return ResponseEntity.ok(Map.of("message", "Appointment booked"));
    }
}
