package dmdv.practice.Heroes;

import dmdv.practice.Enemies.Enemy;

public class Warrior extends Hero{
    public Warrior(String name, int damage, int health) {
        super(name, damage, health);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " бьет топором " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
