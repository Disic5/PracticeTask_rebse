package dmdv.practice.Heroes;

import dmdv.practice.Damage;
import dmdv.practice.Enemies.Enemy;
import dmdv.practice.Mortal;

public abstract class Hero implements Mortal, Damage {
    private String name;
    private int damage;
    private int health;

    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract boolean isAlive();

    public void takeDamage(int damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " погиб ");
        } else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + " осталось " + health);
        }
    }



    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
