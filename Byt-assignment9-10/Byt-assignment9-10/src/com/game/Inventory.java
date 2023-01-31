package com.game;

import java.util.ArrayList;

public class Inventory {
    private String type;
    private ArrayList<Item> items;
    private Character character;

    public Inventory() {
        items = new ArrayList<>();
    }

    public Inventory(String type, Character character) {
        this.type = type;
        this.character = character;
        items = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public boolean isInventoryFull() {
        return items.size() >= 20;
    }

    public Item findItemByName(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}
