package com.project.back_end.services;

import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import java.util.*;
import java.time.LocalDate;
import com.project.back_end.models.Doctor;

@Service
public class DoctorService {

    public List<String> getDoctorAvailability(Long doctorId, LocalDate date) {
        return new ArrayList<>();
    }

    public int saveDoctor(Doctor doctor) {
        return 1;
    }

    public int updateDoctor(Doctor doctor) {
        return 1;
    }

    public List<Doctor> getDoctors() {
        return new ArrayList<>();
    }

    public int deleteDoctor(long id) {
        return 1;
    }

    public ResponseEntity<Map<String, String>> validateDoctor(Object login) {
        return null;
    }
}
