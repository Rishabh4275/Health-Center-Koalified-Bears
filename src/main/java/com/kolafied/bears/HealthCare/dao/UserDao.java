package com.kolafied.bears.HealthCare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kolafied.bears.HealthCare.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}