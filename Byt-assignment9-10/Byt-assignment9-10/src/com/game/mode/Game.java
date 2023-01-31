package com.game.mode;

import java.util.ArrayList;
import java.util.List;

import com.game.Player;
import com.game.pointing.PointingSystem;
import com.game.level.Level;

public class Game {
    private List<Level> levels;
    private PointingSystem pointingSystem;
    private String gameName;
    private int numberOfPlayers;
    private Player[] players;
    private ArrayList<GameMode> gameModes;
    private String description;

    public Game(List<Level> levels, PointingSystem pointingSystem) {
        this.levels = levels;
        this.pointingSystem = pointingSystem;
    }

    public Game(String gameName, int numberOfPlayers) {
        this.gameName = gameName;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public ArrayList<GameMode> getGameModes() {
        return gameModes;
    }

    public void setGameModes(ArrayList<GameMode> gameModes) {
        this.gameModes = gameModes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void start() {
        for (Level level : levels) {
            level.play();
            pointingSystem.addPoints(level.getPoints());
        }
    }
}
