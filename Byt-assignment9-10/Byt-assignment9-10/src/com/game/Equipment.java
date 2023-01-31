package com.game;

public class Equipment extends Item {
    private String armor;
    private String helmet;
    private EquipmentType type;

    public Equipment(String armor, String helmet, EquipmentType type) {
        this.armor = armor;
        this.helmet = helmet;
        this.type = type;
    }

    public void upgradeEquipment() {
        // Upgrades the equipment based on current level and upgrades available
        System.out.println("Equipment upgraded!");
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getHelmet() {
        return helmet;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    public EquipmentType getType() {
        return type;
    }

    public void setType(EquipmentType type) {
        this.type = type;
    }

    @Override
    public void dropItem() {
        // Drops the equipment in the current game location
        System.out.println("Equipment dropped!");
    }

    public enum EquipmentType {
        MELEE,
        RANGED,
        HEAVY
    }
}
