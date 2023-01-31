package com.game;

public class Wizard extends Character {
    private Character character;
    private int magicDamage;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Wizard(String name, int hp, int dex, int lvl, int str, Weapon weapon, String playable, String attackType1, String attackType2, int movementSpeed, String passiveSkill, String activeSkill, int magicDamage) {
        super(name, hp, dex, lvl, str, weapon, playable, attackType1, attackType2, movementSpeed, passiveSkill, activeSkill);
        this.magicDamage = magicDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public int attack() {
        int totalDamage = super.attack() + magicDamage;
        return totalDamage;
    }
    }
}
