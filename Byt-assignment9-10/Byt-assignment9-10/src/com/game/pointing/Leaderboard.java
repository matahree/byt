package com.game.pointing;

import com.game.mode.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaderboard<Score> {
    private List<Score> scores;
    private ArrayList<PointingSystem> pointingSystems;

    private int ranking;
    private String playerName;

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Leaderboard(int i) {
        this.scores = new ArrayList<>();
    }
// adds a new Score object to the leaderboard and sorts the scores in descending order (highest score first).
    public void addScore(Score score) {
        this.scores.add(score);
        Collections.sort(this.scores);
    }
// getTopScores returns the top n scores in the leaderboard. If n is greater than the total number of scores, all scores are returned.
    public <Score> List<Score> getTopScores(int n) {
        if (n > this.scores.size()) {
            return (List<Score>) this.scores;
        }
        return (List<Score>) this.scores.subList(0, n);
    }
// getScores returns the entire list of scores.
    public <Score> List<Score> getScores() {
        return (List<Score>) this.scores;
    }

    public int getNumberOfPlayers() {
        return 0;
    }

    public void setNumberOfPlayers(int i) {
    }

    // Getters and setters for pointingSystems
    public ArrayList<PointingSystem> getPointingSystems() {
        ArrayList<PointingSystem> pointingSystems = null;
        return null;
    }
    public void setPointingSystems(ArrayList<PointingSystem> pointingSystems) {
        this.pointingSystems = pointingSystems;
    }

    private Game game;
}
