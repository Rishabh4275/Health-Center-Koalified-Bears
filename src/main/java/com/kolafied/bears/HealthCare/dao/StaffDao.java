package com.kolafied.bears.HealthCare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kolafied.bears.HealthCare.model.Staff;

@Repository
public interface StaffDao extends JpaRepository<Staff, Long> {
}
