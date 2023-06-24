package org.example.bingChat.TicTacToe;

public static class Position {
    private final int row;
    private final int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return column;
    }
    public boolean isValid(){
        return row>=0 && row < 3 && column >= 0 && column<3;
    }
}
