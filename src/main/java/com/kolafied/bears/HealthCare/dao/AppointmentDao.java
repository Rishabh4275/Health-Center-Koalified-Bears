package com.kolafied.bears.HealthCare.dao;

import com.kolafied.bears.HealthCare.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Long> {
}
