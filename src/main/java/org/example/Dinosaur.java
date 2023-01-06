package org.example;

public class Dinosaur implements Attacker{
    public String name;
    public int attackPower;
    public String type;

    public Dinosaur(String name, int attackPower, String type) {
        this.name = name;
        this.attackPower = attackPower;
        this.type = type;
    }

    public void Attack() {
        System.out.println(this.name + " , a " +type+ " dinosaur "+ "attacks for "+  this.attackPower +" damage!");

    }
}
