package dmdv.practice;

import dmdv.practice.Enemies.Dragon;
import dmdv.practice.Enemies.Enemy;
import dmdv.practice.Enemies.Ork;
import dmdv.practice.Enemies.Zombie;
import dmdv.practice.Heroes.Archer;
import dmdv.practice.Heroes.Hero;
import dmdv.practice.Heroes.Mage;
import dmdv.practice.Heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Hero mage = new Mage("Mage", 20, 100);
        Hero warrior = new Warrior("Warrior", 25, 100);
        Hero archer = new Archer("Archer", 15, 100);

        Enemy dragon = new Dragon("Dragon", 100, 50);
        Enemy ork = new Ork("Ork", 100, 30);
        Enemy zombie = new Zombie("Zombie", 100, 15);

        figth(dragon, warrior);

    }

    public static void figth(Enemy enemy, Hero heroes) {
        while (enemy.isAlive() && heroes.isAlive()) {
            enemy.attackHeroes(heroes);
            heroes.attackEnemy(enemy);

        }
    }
}

//    public static void attackHeroes(Enemy enemy, Hero... heroes){
//        while (enemy.isAlive()){
//            for (Hero hero : heroes) {
//                if (hero.isAlive()){
//                    enemy.attackHeroes(hero);
//                }
//            }
//        }
//    }

