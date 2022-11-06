package dmdv.practice.Heroes;

import dmdv.practice.Enemies.Enemy;

public class Archer extends Hero{
    public Archer(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стреляет из лука  " + enemy.getName());
        enemy.takeDamage(getDamage());
    }



    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

}
