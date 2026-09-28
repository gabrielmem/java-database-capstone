package com.project.back_end.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientDashboardController {

    @GetMapping("/patientDashboard")
    public String patientDashboard() {
        return "patient/patientDashboard";
    }
}
