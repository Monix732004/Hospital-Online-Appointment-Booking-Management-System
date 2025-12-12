package com.Hospital.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Hospital.demo.entity.Patient;
import com.Hospital.demo.repository.PatientRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") // Important for frontend POST requests
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    // Create patient
    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    // Get all patients
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
