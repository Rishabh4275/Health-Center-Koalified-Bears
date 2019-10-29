package com.kolafied.bears.HealthCare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kolafied.bears.HealthCare.model.Patient;

@Repository
public class Patient_HistoryDao extends JpaRepository<Patient_History, Long> {

}
