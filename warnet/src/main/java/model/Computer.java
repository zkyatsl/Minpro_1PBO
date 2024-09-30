/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Computer {
    private int id;
    private String status; 
    private int ratePerHour; 
    
    public static int totalComputers = 0; 

    // Constructor
    public Computer(int id, String status, int ratePerHour) {
        this.id = id;
        this.status = status;
        this.ratePerHour = ratePerHour;
        totalComputers++;
    }

    
    public void displayStatus() {
        System.out.println("Komputer " + id + ": " + status + " (Tarif: " + ratePerHour + " per jam)");
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRatePerHour() {
        return ratePerHour;
    }
}