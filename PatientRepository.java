package com.Hospital.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Hospital.demo.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
