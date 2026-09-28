package com.project.back_end.controllers;

import com.project.back_end.services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@Controller
public class DashboardController {

    @Autowired
    private ValidationService service;

    @GetMapping("/adminDashboard/{token}")
    public String adminDashboard(@PathVariable String token) {
        ResponseEntity<Map<String, String>> response = service.validateToken(token, "admin");
        if (response != null && response.getStatusCode().is2xxSuccessful()) {
            return "admin/adminDashboard";
        }
        return "redirect:/";
    }

    @GetMapping("/doctorDashboard/{token}")
    public String doctorDashboard(@PathVariable String token) {
        ResponseEntity<Map<String, String>> response = service.validateToken(token, "doctor");
        if (response != null && response.getStatusCode().is2xxSuccessful()) {
            return "doctor/doctorDashboard";
        }
        return "redirect:/";
    }
}