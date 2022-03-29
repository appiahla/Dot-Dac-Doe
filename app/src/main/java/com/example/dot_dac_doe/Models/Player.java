package com.example.dot_dac_doe.Models;


public abstract class Player {
    protected final String name;
    protected Graph game;
    private String tag;

    public Player(String name) {
        this.name = name;
    }

    public static int indexIn(Player player, Player[] players) {
        for (int i = 0; i < players.length; i++) {
            if (player == players[i])
                return i;
        }
        return -1;
    }

    public abstract Line move();

    public String getName() {
        return name;
    }

    public Graph getGame() {
        return game;
    }

    public void addToGame(Graph game) {
        this.game = game;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}


