package org.example;

public class Main {
    public static void main(String[] args) {
        Lightsaber lightsaber = new Lightsaber();
        Knife knife = new Knife();
        Rifle rifle = new Rifle();
        Attacker robot_one = new Robot(lightsaber, "Bender Rodriguez ");
        Attacker robot_two = new Robot(knife, "Eva Unit-01 ");
        Attacker robot_three = new Robot(rifle, "Gundam Zero-One ");
        Attacker kaiju_one = new Kaiju("Godzilla ", 85);
        Attacker kaiju_two = new Kaiju("Rodan ", 92);
        Attacker kaiju_three = new Kaiju("Gamera ", 88);
        robot_one.Attack();
        robot_two.Attack();
        robot_three.Attack();
        kaiju_one.Attack();
        kaiju_two.Attack();
        kaiju_three.Attack();

    }
}