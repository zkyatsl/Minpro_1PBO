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
        computers.add(new Computer(1, "Online", 5000));
        computers.add(new Computer(2, "Offline", 0));
        computers.add(new Computer(3, "Online", 5000));

        
        user user1 = new user("Jaksal", 27000);
        user user2 = new user("fufufafa", 15000);

        for (Computer comp : computers) {
            comp.displayStatus();
        }

        
        user1.useComputer(computers.get(0)); 
        user2.useComputer(computers.get(1)); 

        for (Computer comp : computers) {
            comp.displayStatus();
        }
    }
}
