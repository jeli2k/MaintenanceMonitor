package com.example.maintenancemonitor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {

    String message = "Everything works as expected";

    @RequestMapping(path = "api/message")
    public String getMessage() {
        return message;
    }

    @RequestMapping(path = "api/message/set")
    public String setMessage(@RequestParam String m) {
        this.message = m;
        return "ok";
    }
}