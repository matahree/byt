package com.game;

public class Weapon extends Item {
    private int attackPower;

    public Weapon(int attackPower) {
        super();
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void upgradeWeapon() {
        this.attackPower += 10;
    }

    @Override
    public void dropItem() {
        System.out.println("Weapon dropped");
    }
}
