package com.project.back_end.services;
import com.project.back_end.models.Doctor;
import com.project.back_end.repo.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.*;
@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    public List<Doctor> getDoctors() {
        return doctorRepository.findAll();
    }
    public List<String> getDoctorAvailability(Long doctorId, LocalDate date) {
        return new ArrayList<>();
    }
    public int saveDoctor(Doctor doctor) { return 1; }
    public int updateDoctor(Doctor doctor) { return 1; }
    public int deleteDoctor(long id) { return 1; }
    public ResponseEntity<Map<String, String>> validateDoctor(Object login) { return null; }
}
