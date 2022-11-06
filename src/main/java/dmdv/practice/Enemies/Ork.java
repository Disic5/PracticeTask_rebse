package dmdv.practice.Enemies;

import dmdv.practice.Heroes.Hero;

public class Ork extends Enemy{
    public Ork(String name, int health, int damage) {
        super(name, health, damage);
    }
    @Override
    public void attackHeroes(Hero hero) {
        System.out.println(getName() + " бьет щиитом и булавой " + hero.getName());
        hero.takeDamage(getDamage());
    }
    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
