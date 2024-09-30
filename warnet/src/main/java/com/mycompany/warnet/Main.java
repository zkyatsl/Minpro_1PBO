/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.warnet;

/**
 *
 * @author Lenovo
 */


import java.util.ArrayList;
import model.Computer;
import model.user;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer(1, "Online", 4000));
        computers.add(new Computer(2, "Offline", 0));
        computers.add(new Computer(3, "Online", 4000));

           
        user user1 = new user("Jaksal", 20000);
        user user2 = new user("fufufafa", 10000);

        System.out.println("Status Komputer :");
        displayComputerTable(computers);

        user1.useComputer(computers.get(0)); 
        user2.useComputer(computers.get(1)); 
        
        System.out.println("\nStatus Komputer :");
        displayComputerTable(computers);
        
        System.out.println("\nStatus Pengguna:");
        displayUserTable(user1, user2);
    }

    public static void displayComputerTable(ArrayList<Computer> computers) {
        System.out.printf("%-10s %-10s %-10s\n", "ID", "Status", "Tarif per Jam");
        System.out.println("-----------------------------------");
        for (Computer comp : computers) {
            System.out.printf("%-10d %-10s %-10d\n", comp.getId(), comp.getStatus(), comp.getRatePerHour());
        }
    }

    public static void displayUserTable(user... users) {
        System.out.printf("%-10s %-10s\n", "Nama", "Saldo");
        System.out.println("---------------------");
        for (user user : users) {
            System.out.printf("%-10s %-10d\n", user.getName(), user.getBalance());
        }
    }
}
