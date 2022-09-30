package org.example;

public class Kaiju implements Attacker{
    //Instance variables (HAS A)
    public String name;
    public int attackPower;

    //Constructor
    public Kaiju(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + "attacks with for " + this.attackPower + " damage!");

    }
}
