package dmdv.practice.Heroes;

import dmdv.practice.Enemies.Enemy;

public class Mage extends Hero{
    public Mage(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " кидает fireball " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
