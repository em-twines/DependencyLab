package org.example;

public class Robot implements Attacker{

    //Instance variables (has a)
    public String name;
    public Weapon weapon;

    //Constructor
    public Robot(Weapon weapon) {
        this.name = "Hal";
        this.weapon = weapon;

    }
    //Methods (can do);
    public void Attack(){
        System.out.println(this.name + " attacks with " + weapon.name + " for " + weapon.power + " damage!");
    }
}
