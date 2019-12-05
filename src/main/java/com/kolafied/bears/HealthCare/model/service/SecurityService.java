package com.kolafied.bears.HealthCare.model.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}