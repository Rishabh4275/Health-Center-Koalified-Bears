package com.kolafied.bears.HealthCare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kolafied.bears.HealthCare.model.Role;

public interface RoleDao extends JpaRepository<Role, Long>{
}