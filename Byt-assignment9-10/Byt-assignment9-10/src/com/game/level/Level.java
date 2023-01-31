package com.game.level;

import com.game.mode.Game;

public class Level extends Game {

    private int levelNumber;
    private int difficulty;
    private int points;

    public Level(int levelNumber, int difficulty) {
        this.levelNumber = levelNumber;
        this.difficulty = difficulty;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void generateLevel() {
        // random number generator for the level difficulty
        int difficulty = (int) (Math.random() * 3 + 1);
        setDifficulty(difficulty);

        // logic to generate different types of levels based on the generated number
        switch (difficulty) {
            case 1:
                System.out.println("Level Difficulty: Beginner");
                break;
            case 2:
                System.out.println("Level Difficulty: Intermediate");
                break;
            case 3:
                System.out.println("Level Difficulty: Advanced");
                break;
        }
    }

    public void play() {
        // play logic for the level
        System.out.println("Playing level " + levelNumber + " with difficulty " + difficulty);
        setPoints((int) (Math.random() * 100));
        System.out.println("Level " + levelNumber + " completed. Points earned: " + points);
    }
}
}
