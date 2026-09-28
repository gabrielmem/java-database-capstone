package com.project.back_end.services;

import org.springframework.stereotype.Service;
import com.project.back_end.models.Appointment;
import org.springframework.http.ResponseEntity;
import java.util.*;
import java.time.LocalDate;

@Service
public class AppointmentService {

    public int bookAppointment(Appointment appointment) {
        return 1;
    }

    public ResponseEntity<Map<String, String>> updateAppointment(Appointment appointment) {
        return null;
    }

    public ResponseEntity<Map<String, String>> cancelAppointment(long id, String token) {
        return null;
    }

    public Map<String, Object> getAppointment(String pname, LocalDate date, String token) {
        return new HashMap<>();
    }
}
