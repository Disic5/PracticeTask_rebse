package dmdv.practice.Enemies;

import dmdv.practice.Damage;
import dmdv.practice.Heroes.Hero;
import dmdv.practice.Mortal;

public abstract class Enemy implements Mortal, Damage {
    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public abstract void attackHeroes(Hero hero);
    public abstract boolean isAlive();



    public void takeDamage(int damage){
        if (isAlive() && health <= damage){
            health = 0;
            System.out.println(getName() + " погиб ");
        }else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + " осталось " + health);
        }
    }





    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }
}
