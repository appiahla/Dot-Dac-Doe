package com.example.dot_dac_doe.Models;

import java.util.Observable;

public class Graph extends Observable {
    private Player[] players;
    private int currentPlayerIndex;
    private int width;
    private int height;
    private Player[][] points;
    private int[][] horiLines;
    private int[][] vertLines;
    private Line newestLine;

    public Graph(int width, int height, Player[] players) {
        this.width = width;
        this.height = height;
        this.players = players;

        points = new Player[height][width];
        horiLines = new int[height + 1][width];
        vertLines = new int[height][width + 1];

        addPlayersToGame(players);
        currentPlayerIndex = 0;
    }

    public Player[] getPlayers() {
        return players;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private void addPlayersToGame(Player[] players) {
        for (Player player : players) {
            player.addToGame(this);
        }
    }

    public boolean isLineOccupied(Line line) {
        switch (line.direction()) {
            case HORIZONTAL:
                return (horiLines[line.row()][line.column()] == 1
                        || horiLines[line.row()][line.column()] == 2);
            case VERTICAL:
                return (vertLines[line.row()][line.column()] == 1
                        || vertLines[line.row()][line.column()] == 2);
        }
        throw new IllegalArgumentException(line.direction().toString());
    }

    public void start() {
        while (!isGameWon()) {
            addMove(currentPlayer().move());
            setChanged();
            notifyObservers();
        }
    }

    public Player getWinner() {
        if (!isGameWon()) {
            return null;
        }

        int[] playersPoints = new int[players.length];
        for (int i = 0; i < players.length; i++) {
            playersPoints[i] = getPlayerPoints(players[i]);
        }

        if (playersPoints[0] > playersPoints[1])
            return players[0];
        else
            return players[1];
    }

    public Player currentPlayer() {
        return players[currentPlayerIndex];
    }

    public void addMove(Line move) {
        if (isLineOccupied(move)) {
            return;
        }
        boolean newBoxOccupied = tryToOccupyBox(move);
        setLineOccupied(move);
        newestLine = move;

        if (!newBoxOccupied)
            toNextPlayer();
    }

    public boolean isLineOccupied(Direction direction, int row, int column) {
        return isLineOccupied(new Line(direction, row, column));
    }

    public Line getNewestLine() {
        return newestLine;
    }

    public int getLineOccupier(Line line) {
        switch (line.direction()) {
            case HORIZONTAL:
                return horiLines[line.row()][line.column()];
            case VERTICAL:
                return vertLines[line.row()][line.column()];
        }
        throw new IllegalArgumentException(line.direction().toString());
    }

    public Player getBoxOccupier(int row, int column) {
        return points[row][column];
    }

    public int getPlayerPoints(Player player) {
        int count = 0;
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                if (getBoxOccupier(i, j) == player)
                    count++;
            }
        }
        return count;
    }

    private boolean tryToOccupyBox(Line move) {
        boolean rightOccupied = tryToOccupyRightBox(move);
        boolean underOccupied = tryToOccupyUnderBox(move);
        boolean upperOccupied = tryToOccupyUpperBox(move);
        boolean leftOccupied = tryToOccupyLeftBox(move);
        return leftOccupied || rightOccupied || upperOccupied || underOccupied;
    }

    private void setLineOccupied(Line line) {
        switch (line.direction()) {
            case HORIZONTAL:
                horiLines[line.row()][line.column()] = currentPlayerIndex + 1;
                break;
            case VERTICAL:
                vertLines[line.row()][line.column()] = currentPlayerIndex + 1;
                break;
        }
    }

    private void setBoxOccupied(int row, int column, Player player) {
        points[row][column] = player;
    }

    private boolean tryToOccupyUpperBox(Line move) {
        if (move.direction() != Direction.HORIZONTAL || move.row() <= 0)
            return false;
        if (isLineOccupied(Direction.HORIZONTAL, move.row() - 1, move.column())
                && isLineOccupied(Direction.VERTICAL, move.row() - 1, move.column())
                && isLineOccupied(Direction.VERTICAL, move.row() - 1, move.column() + 1)) {
            setBoxOccupied(move.row() - 1, move.column(), currentPlayer());
            return true;
        } else {
            return false;
        }
    }

    private boolean tryToOccupyUnderBox(Line move) {
        if (move.direction() != Direction.HORIZONTAL || move.row() >= (height))
            return false;
        if (isLineOccupied(Direction.HORIZONTAL, move.row() + 1, move.column())
                && isLineOccupied(Direction.VERTICAL, move.row(), move.column())
                && isLineOccupied(Direction.VERTICAL, move.row(), move.column() + 1)) {
            setBoxOccupied(move.row(), move.column(), currentPlayer());
            return true;
        } else {
            return false;
        }
    }

    private boolean tryToOccupyLeftBox(Line move) {
        if (move.direction() != Direction.VERTICAL || move.column() <= 0)
            return false;
        if (isLineOccupied(Direction.VERTICAL, move.row(), move.column() - 1)
                && isLineOccupied(Direction.HORIZONTAL, move.row(), move.column() - 1)
                && isLineOccupied(Direction.HORIZONTAL, move.row() + 1, move.column() - 1)) {
            setBoxOccupied(move.row(), move.column() - 1, currentPlayer());
            return true;
        } else {
            return false;
        }
    }

    private boolean tryToOccupyRightBox(Line move) {
        if (move.direction() != Direction.VERTICAL || move.column() >= (width))
            return false;
        if (isLineOccupied(Direction.VERTICAL, move.row(), move.column() + 1)
                && isLineOccupied(Direction.HORIZONTAL, move.row(), move.column())
                && isLineOccupied(Direction.HORIZONTAL, move.row() + 1, move.column())) {
            setBoxOccupied(move.row(), move.column(), currentPlayer());
            return true;
        } else {
            return false;
        }
    }

    private void toNextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
    }

    protected boolean isGameWon() {
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                if (getBoxOccupier(i, j) == null)
                    return false;
            }
        }
        return true;
    }


}