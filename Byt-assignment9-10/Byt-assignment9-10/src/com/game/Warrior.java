package com.game;

public class Warrior extends Character {
    private Character character;

    private int Physical_Damage;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Warrior(String name, int HP, int Dex, int LVL, int Str, Weapon weapon, String Playable,
                   String Attack_Type1, String Attack_Type2, int Movement_Speed, String passiveSkill,
                   String Active_Skill, int Physical_Damage) {
        super(name, HP, Dex, LVL, Str, weapon, Playable, Attack_Type1, Attack_Type2, Movement_Speed, passiveSkill, Active_Skill);
        this.Physical_Damage = Physical_Damage;
    }

    public int getPhysical_Damage() {
        return Physical_Damage;
    }

    public void setPhysical_Damage(int physical_Damage) {
        Physical_Damage = physical_Damage;
    }
}
