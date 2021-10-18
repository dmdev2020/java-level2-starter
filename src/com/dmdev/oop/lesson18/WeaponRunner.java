package com.dmdev.oop.lesson18;

import com.dmdev.oop.lesson15.Archer;
import com.dmdev.oop.lesson15.Hero;
import com.dmdev.oop.lesson15.Warrior;
import com.dmdev.oop.lesson18.weapon.Bow;
import com.dmdev.oop.lesson18.weapon.Sword;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Боромир", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(warrior);
    }

//                                       Warrior<----->
    public static void printWeaponDamage(Hero<Sword> hero) {
        Sword weapon = hero.getWeapon();
        hero.setWeapon(new Sword());
        System.out.println(hero.getWeapon().getDamage());
    }
}
