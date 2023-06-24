package org.example.bingChat.TicTacToe;

import com.sun.jdi.Value;

import javax.swing.text.Position;
import java.util.Scanner;

public class CrossAndRing {
    public enum Value {
        // Każda wartość ma pole name i metodę opposite()
        EMPTY(" ") {
            @Override
            public Value opposite() {
                return EMPTY;
            }
        },
        X("X") {
            @Override
            public Value opposite() {
                return O;
            }
        },
        O("O") {
            @Override
            public Value opposite() {
                return X;
            }
        };

        // Pole name przechowuje nazwę wartości
        private final String name;

        // Konstruktor enuma ustawia pole name
        Value(String name) {
            this.name = name;
        }

        // Metoda toString() zwraca nazwę wartości
        @Override
        public String toString() {
            return name;
        }

        // Metoda abstrakcyjna opposite() zwraca przeciwną wartość
        public abstract Value opposite();
    }

    // Definiujemy klasę Scanner do pobierania danych wejściowych od użytkownika
    public static Scanner scanner = new Scanner(System.in);

    // Definiujemy stałą dla rozmiaru planszy
    public static final int SIZE = 3;

    public static void main(String[] args) {
        // Definiujemy tablicę 3x3 do reprezentowania planszy
        Value[][] board = new Value[SIZE][SIZE];
        // Wypełniamy tablicę pustymi wartościami
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = Value.EMPTY;
            }
        }
        // Definiujemy zmienną dla aktualnego gracza
        Value currentPlayer = Value.X;
        // Definiujemy zmienną dla liczby pustych pól
        int emptyFields = SIZE * SIZE;
        // Używamy pętli while do symulowania kolejnych tur gry
        while (true) {
            // Wyświetlamy aktualny stan planszy
            printBoard(board);
            // Pobieramy pozycję od użytkownika
            Position position = getPosition();
            // Sprawdzamy, czy pole jest puste
            if (board[position.getRow()][position.getColumn()] == Value.EMPTY) {
                // Ustawiamy wartość na planszy
                board[position.getRow()][position.getColumn()] = currentPlayer;
                // Zmniejszamy liczbę pustych pól
                emptyFields--;
                // Sprawdzamy, czy gra się skończyła
                if (isGameOver(board, position)) {
                    // Wyświetlamy komunikat o zwycięstwie i kończymy pętlę
                    System.out.println("Gracz " + currentPlayer + " wygrywa!");
                    break;
                }
                // Sprawdzamy, czy jest remis
                if (emptyFields == 0) {
                    // Wyświetlamy komunikat o remisie i kończymy pętlę
                    System.out.println("Remis!");
                    break;
                }
                // Zmieniamy aktualnego gracza na przeciwnego
                currentPlayer = currentPlayer.opposite();
            } else {
                // Wyświetlamy komunikat o błędzie i kontynuujemy pętlę
                System.out.println("To pole jest zajęte. Spróbuj ponownie.");
            }
        }
    }

    // Metoda pomocnicza do wyświetlania planszy
    public static void printBoard(Value[][] board) {
        System.out.println("  a b c");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                if (j < SIZE - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < SIZE - 1) {
                System.out.println("  -----");
            }
        }
    }

    // Metoda pomocnicza do pobierania pozycji od użytkownika
    public static Position getPosition() {
        while (true) {
            System.out.print("Podaj pozycję: ");
            String input = scanner.nextLine();
            if (input.length() == 2) {
                char letter = input.charAt(0);
                char digit = input.charAt(1);
                if (letter >= 'a' && letter <= 'c' && digit >= '1' && digit <= '3') {
                    int row = digit - '1';
                    int column = letter - 'a';
                    return new Position(row, column);
                }
            }
            System.out.println("Błędna pozycja. Spróbuj ponownie.");
        }
    }

    // Metoda pomocnicza do sprawdzania, czy gra się skończyła
    public static boolean isGameOver(Value[][] board, Position position) {
        // Pobieramy wartość z podanej pozycji
        Value value = board[position.getRow()][position.getColumn()];
        // Sprawdzamy, czy są trzy takie same wartości w linii poziomej
        boolean horizontal = true;
        for (int j = 0; j < SIZE; j++) {
            if (board[position.getRow()][j] != value) {
                horizontal = false;
                break;
            }
        }
        // Sprawdzamy, czy są trzy takie same wartości w linii pionowej
        boolean vertical = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][position.getColumn()] != value) {
                vertical = false;
                break;
            }
        }
        // Sprawdzamy, czy są trzy takie same wartości w linii ukośnej
        boolean diagonal = true;
        if (position.getRow() == position.getColumn()) {
            for (int i = 0; i < SIZE; i++) {
                if (board[i][i] != value) {
                    diagonal = false;
                    break;
                }
            }
        } else {
            diagonal = false;
        }
        // Sprawdzamy, czy są trzy takie same wartości w linii przeciwnej
        boolean antiDiagonal = true;
        if (position.getRow() + position.getColumn() == SIZE - 1) {
            for (int i = 0; i < SIZE; i++) {
                if (board[i][SIZE - 1 - i] != value) {
                    antiDiagonal = false;
                    break;
                }
            }
        } else {
            antiDiagonal = false;
        }
        // Zwracamy true, jeśli któryś z warunków jest spełniony
        return horizontal || vertical || diagonal || antiDiagonal;
    }

    // Definiujemy klasę Position do reprezentowania pozycji na planszy
    public static class Position {
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
            return row >= 0 && row < SIZE && column >= 0 && column < SIZE;
        }
    }
}
