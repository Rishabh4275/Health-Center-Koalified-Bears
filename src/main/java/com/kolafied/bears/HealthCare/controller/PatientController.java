package com.kolafied.bears.HealthCare.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kolafied.bears.HealthCare.dao.PatientDao;
import com.kolafied.bears.HealthCare.model.Patient;

@RestController
@RequestMapping({"/patients"})
public class PatientController {

    @Autowired
    PatientDao patient;

    @GetMapping("/all")
    public List<Patient> getAllNotes() {
        return patient.findAll();
    }

    @PostMapping("/add")
    public Patient addPatient(@Valid @RequestBody Patient patientAdd) {
        return patient.save(patientAdd);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getNoteById(@PathVariable(value = "id") Long id) {
        return patient.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable(value = "id") Long id,
                           @Valid @RequestBody Patient patientUpdate) {

        return patient.findById(id)
                .map(record -> {
                    record.setFirstName(patientUpdate.getFirstName());
                    record.setEmail(patientUpdate.getEmail());
                    record.setMobile(patientUpdate.getMobile());
                    Patient updated = patient.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long id) {
        return patient.findById(id)
                .map(record -> {
                    patient.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
