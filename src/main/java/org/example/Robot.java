package org.example;

public class Robot {
    //Instance variables (HAS A)
    public String name;
    public String weaponName;
    public int weaponPower;

    //Constructor
    public Robot() {
        this.name = "Bender Rodriguez";
        this.weaponName = "Belch Fireball";
        this.weaponPower = 50;
    }

    //Methods (CAN DO)
    public void Attack(){
        System.out.println(this.name + "attacks with their" + this.weaponName + "for" + this.weaponPower + "damage!");
    }
}
