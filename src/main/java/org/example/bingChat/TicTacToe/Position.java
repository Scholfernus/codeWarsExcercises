package org.example.bingChat.TicTacToe;

// Definiujemy klasę Position do reprezentowania pozycji na planszy
public class Position {
    // Definiujemy dwa pola: row i column
    private final int row;
    private final int column;

    // Definiujemy konstruktor klasy Position
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    // Definiujemy metodę getRow(), która zwraca wartość pola row
    public int getRow() {
        return row;
    }

    // Definiujemy metodę getColumn(), która zwraca wartość pola column
    public int getColumn() {
        return column;
    }

    // Definiujemy metodę isValid(), która sprawdza, czy pozycja jest poprawna
    public boolean isValid() {
        return row >= 0 && row < 3 && column >= 0 && column < 3;
    }
}

