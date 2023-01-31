package com.game;

import java.util.Random;

public class Monster extends Character {
    private String monsterType;

    public Monster(String name, int hp, int dex, int lvl, int str, Weapon weapon, String playable,
                   String attackType1, String attackType2, int movementSpeed, String passiveSkill,
                   String activeSkill, String monsterType) {
        super(name, hp, dex, lvl, str, weapon, playable, attackType1, attackType2, movementSpeed, passiveSkill, activeSkill);
        this.monsterType = monsterType;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public void dropGold() {
        int goldAmount = new Random().nextInt(100) + 1;
        System.out.println(getName() + " dropped " + goldAmount + " gold.");
    }

    public void generateMonster() {
        String[] monsterTypes = {"Goblin", "Orc", "Troll", "Dragon", "Zombie"};
        int randomIndex = new Random().nextInt(monsterTypes.length);
        setMonsterType(monsterTypes[randomIndex]);
        System.out.println(getName() + " is a " + getMonsterType());
    }
}
