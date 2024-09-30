/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class user {
    private String name;
    private int balance; 
    private Computer currentComputer; 

    public user(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.currentComputer = null;
    }
    
    public void useComputer(Computer computer) {
        if (computer.getStatus().equals("Online") && balance >= computer.getRatePerHour()) {
            currentComputer = computer;
            balance -= computer.getRatePerHour(); 
            computer.setStatus("In Use"); 
            System.out.println(name + " memakai Komputer " + computer.getId() + " selama 1 jam.");
        } else {
            System.out.println(name + " gabisa memakai komputer ini.");
        }
    }

    
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}

