package org.example;

public class Robot {

    //Instance variables (has a)
    public String name;
    public Weapon weapon;

    //Constructor
    public Robot() {
        this.name = "Hal";
        this.weapon = new Weapon("Electric Shock", 15);

    }
    //Methods (can do);
    public void Attack(){
        System.out.println(this.name + " attacks with " + weapon.name + "for " + weapon.power + " damage!");
    }
}
