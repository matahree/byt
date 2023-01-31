package com.game;

class Character {
    private String name;
    private int HP;
    private int Dex;
    private int LVL;
    private int Str;
    private Weapon weapon;
    private boolean isPlayable;
    private String attackType1;
    private String attackType2;
    private int movementSpeed;
    private String passiveSkill;
    private String activeSkill;
    private Inventory inventory;
    private int position;

    public Character(String name, int HP, int Dex, int LVL, int Str, Weapon weapon, boolean isPlayable, String attackType1, String attackType2, int movementSpeed, String passiveSkill, String activeSkill, Inventory inventory) {
        this.name = name;
        this.HP = HP;
        this.Dex = Dex;
        this.LVL = LVL;
        this.Str = Str;
        this.weapon = weapon;
        this.isPlayable = isPlayable;
        this.attackType1 = attackType1;
        this.attackType2 = attackType2;
        this.movementSpeed = movementSpeed;
        this.passiveSkill = passiveSkill;
        this.activeSkill = activeSkill;
        this.inventory = inventory;
    }

    public Character(String name, int hp, int dex, int lvl, int str, String weapon, String playable, String attackType1, String attackType2, int movementSpeed, String passiveSkill, String activeSkill, String passive_skill, String active_skill, Inventory inventory) {
        this.passiveSkill = passive_skill;
        this.passiveSkill = active_skill;
        this.inventory = inventory;
    }

    public Character(String name, int hp, int dex, int lvl, int str, Weapon weapon, String playable, String attackType1, String attackType2, int movementSpeed, String passiveSkill, String activeSkill, String passive_skill, String active_skill, Inventory inventory) {
        this.passiveSkill = passive_skill;
        this.activeSkill = active_skill;
        this.inventory = inventory;
    }

    public Character(String name, int hp, int dex, int lvl, int str, Weapon weapon, String playable, String attackType1, String attackType2, int movementSpeed, String passiveSkill, String activeSkill, String passive_skill, String active_skill) {
        this.passiveSkill = passive_skill;
        this.activeSkill = active_skill;
        inventory = null;
    }

    public Character(String passive_skill, String active_skill, Inventory inventory) {

        this.passiveSkill = passive_skill;
        this.activeSkill = active_skill;
        this.inventory = inventory;
    }

    public Character(String name, int hp, int dex, int lvl, int str, Weapon weapon, String playable, String attackType1, String attackType2, int movementSpeed, String passiveSkill, String activeSkill, String passive_skill) {
        this.passiveSkill = passive_skill;
    }

    public Character(String name, int hp, int dex, int lvl, int str, Weapon weapon, String playable, String attackType1, String attackType2, int movementSpeed, String passiveSkill, String activeSkill) {
    }

    public void die() {
        this.HP = 0;
        System.out.println(this.name + " has died.");
    }

    public void move() {
        this.position += this.movementSpeed;
        System.out.println(this.name + " has moved to a new position.");
    }

    public void attack() {
        System.out.println(this.name + " has attacked with " + this.attackType1 + " or " + this.attackType2 + ".");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDex() {
        return Dex;
    }

    public void setDex(int dex) {
        Dex = dex;
    }

    public int getLVL() {
        return LVL;
    }

    public void setLVL(int LVL) {
        this.LVL = LVL;
    }

    public int getStr() {
        return Str;
    }

    public void setStr(int str) {
        Str = str;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public String getAttackType1() {
        return attackType1;
    }

    public void setAttackType1(String attackType1) {
        this.attackType1 = attackType1;
    }


    public String getAttackType2() {
        return attackType2;
    }

    public void setAttackType2(String attackType2) {
        this.attackType2 = attackType2;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public String getPassiveSkill() {
        return passiveSkill;
    }

    public void setPassiveSkill(String passiveSkill) {
        this.passiveSkill = passiveSkill;
    }

    public String getActiveSkill() {
        return activeSkill;
    }

    public void setActiveSkill(String activeSkill) {
        this.activeSkill = activeSkill;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


}