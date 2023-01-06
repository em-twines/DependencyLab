package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ElectricShock electric_shock = new ElectricShock();
        MindControl mind_control = new MindControl();
        AI ai = new AI();

        Attacker robot_one = new Robot(electric_shock);
        Attacker dinosaur_one = new Dinosaur("K-2", 20, "fire");
        robot_one.Attack();
        dinosaur_one.Attack();

    }
}

