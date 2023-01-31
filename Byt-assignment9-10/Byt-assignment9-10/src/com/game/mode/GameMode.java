package com.game.mode;

public class GameMode {
    private String mode;
    private Game game;

    public static final String BEGINNER = "Beginner";
    public static final String INTERMEDIATE = "Intermediate";
    public static final String ADVANCED = "Advanced";

    public GameMode(String mode) {
        this.mode = mode;
    }

    public void changeMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
