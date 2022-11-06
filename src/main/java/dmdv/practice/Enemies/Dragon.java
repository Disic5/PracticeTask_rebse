package dmdv.practice.Enemies;

import dmdv.practice.Heroes.Hero;

public class Dragon extends Enemy{
    public Dragon(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackHeroes(Hero hero) {
        System.out.println(getName() + " сжигает всё огнем " + hero.getName());
        hero.takeDamage(getDamage());
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

}
