package com.game;


import com.game.mode.Game;

public class Player extends Character {
    private String nickname;
    private int lvlForGame;
    private Game game;
    private Inventory inventory;

    public Player(String name, int hp, int dex, int lvl, int str, Weapon weapon, String playable,
                  String attackType1, String attackType2, int movementSpeed, Inventory inventory, Game game,
                  String nickname, int lvlForGame) {
        super(name, hp, dex, lvl, str, weapon, playable, attackType1, attackType2, movementSpeed, null, null);
        this.nickname = nickname;
        this.lvlForGame = lvlForGame;
        this.inventory = inventory;
        this.game = game;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLvlForGame() {
        return lvlForGame;
    }

    public void setLvlForGame(int lvlForGame) {
        this.lvlForGame = lvlForGame;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void pickUpItem() {
        // logic to pick up an item in the game
        System.out.println("Item picked up by the player.");
    }

    public void lockToMonster() {
        // logic to lock the player to a monster in the game
        System.out.println("Player locked to a monster.");
    }

    public void pickUpGold() {
        // logic to pick up gold in the game
        System.out.println("Gold picked up by the player.");
    }
}
