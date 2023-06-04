package com.example.maintenancemonitor.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaintenanceMonitorControllerTest {

    private MaintenanceMonitorController maintenanceMonitorController = new MaintenanceMonitorController();

    @Test
    public void setMessageTest() {
        // Arrange
        String m = "Service checks: No power until 5:00 pm";
        // Act
        String result = maintenanceMonitorController.setMessage(m);
        // Assert
        assertEquals("ok", result);
    }

    @Test
    public void setANDgetMessageTest() {
        // Arrange
        String m = "Service checks: No power until 5:00 pm";
        // Act
        maintenanceMonitorController.setMessage(m);
        // Assert
        assertEquals(m, maintenanceMonitorController.getMessage());
    }

    @Test
    public void setMessageTestEmpty() {
        // Arrange
        String m = "";
        // Act
        maintenanceMonitorController.setMessage(m);
        // Assert
        assertEquals(m, maintenanceMonitorController.getMessage());
    }

    @Test
    public void resetMessageTest() {
        // Arrange
        String m = "Service checks: No power until 5:00 pm";
        maintenanceMonitorController.setMessage(m);
        // Act
        String result = maintenanceMonitorController.resetMessage();
        // Assert
        assertEquals("ok", result);
        maintenanceMonitorController.resetMessage();
        assertEquals("Everything works as expected", maintenanceMonitorController.getMessage());
    }
    @Test
    public void getMessageTest() {
        // Arrange
        String m = "Everything works as expected";
        // Act
        String result = maintenanceMonitorController.getMessage();
        // Assert
        assertEquals(m, result);
    }
}
