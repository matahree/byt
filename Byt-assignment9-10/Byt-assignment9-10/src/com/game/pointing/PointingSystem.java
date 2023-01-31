package com.game.pointing;

import java.util.HashMap;
import java.util.Map;

public class PointingSystem {
    private Map<String, Integer> playerPoints;

    private Leaderboard leaderboard;
    // Getters and setters for leaderboard
    public Leaderboard getLeaderboard() {
        return leaderboard;
    }
    public void setLeaderboard(Leaderboard leaderboard) {
        this.leaderboard = leaderboard;
    }

    public PointingSystem() {
        this.playerPoints = new HashMap<>();
    }

    public void addPoints(String playerName, int points) {
        if (playerPoints.containsKey(playerName)) {
            playerPoints.put(playerName, playerPoints.get(playerName) + points);
        } else {
            playerPoints.put(playerName, points);
        }
    }

    public int getPoints(String playerName) {
        return playerPoints.getOrDefault(playerName, 0);
    }

    public Map<String, Integer> getAllPlayerPoints() {
        return playerPoints;
    }

    public void addPoints(Object points) {
    }

}
