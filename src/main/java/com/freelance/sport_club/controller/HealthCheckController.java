package com.freelance.sport_club.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author d.virak
 * @version 1.0, 2024-03-01
 * @implNote Use for check the health's API
 */
@RestController
@RequestMapping("/api/v1/freelance/health-check")
public class HealthCheckController {

    /**
     * @return statusData
     * @implNote Get the health of API
     */
    @GetMapping
    public Map<String, Object> getAPIHealth() {
        Map<String, Object> statusData = new LinkedHashMap<>();
        String currentDateTime = LocalDateTime.now().toString();
        statusData.put("serviceStatus", "UP");
        statusData.put("currentDateTime", currentDateTime);
        return statusData;
    }

}
