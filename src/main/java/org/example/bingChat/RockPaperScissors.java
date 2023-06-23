package org.example.bingChat;

import java.security.SecureRandom;

public class RockPaperScissors {
    // Definiujemy enum dla trzech symboli
    public enum Symbol {
        // Każdy symbol ma pole name i metodę compare()
        PAPER("Papier") {
            @Override
            public int compare(Symbol other) {
                switch (other) {
                    case PAPER:
                        return 0;
                    case ROCK:
                        return 1;
                    case SCISSORS:
                        return -1;
                    default:
                        return 0;
                }
            }
        },
        ROCK("Kamień") {
            @Override
            public int compare(Symbol other) {
                switch (other) {
                    case PAPER:
                        return -1;
                    case ROCK:
                        return 0;
                    case SCISSORS:
                        return 1;
                    default:
                        return 0;
                }
            }
        },
        SCISSORS("Nożyce") {
            @Override
            public int compare(Symbol other) {
                switch (other) {
                    case PAPER:
                        return 1;
                    case ROCK:
                        return -1;
                    case SCISSORS:
                        return 0;
                    default:
                        return 0;
                }
            }
        };

        // Pole name przechowuje nazwę symbolu
        private final String name;

        // Konstruktor enuma ustawia pole name
        Symbol(String name) {
            this.name = name;
        }

        // Metoda toString() zwraca nazwę symbolu
        @Override
        public String toString() {
            return name;
        }

        // Metoda abstrakcyjna compare() porównuje dwa symbole
        public abstract int compare(Symbol other);
    }

    // Definiujemy klasę SecureRandom do generowania losowych symboli
    public static SecureRandom secureRandom = new SecureRandom();

    // Definiujemy stałą dla liczby punktów potrzebnych do wygranej
    public static final int WIN_POINTS = 3;

    public static void main(String[] args) {
        // Definiujemy zmienne dla punktów graczy
        int player1Points = 0;
        int player2Points = 0;

        // Używamy pętli while do symulowania kolejnych rund gry
        while (player1Points < WIN_POINTS && player2Points < WIN_POINTS) {
            // Wygeneruj losowy symbol dla każdego gracza
            Symbol player1Symbol = randomSymbol();
            Symbol player2Symbol = randomSymbol();

            // Porównaj symbole za pomocą metody compare()
            int result = player1Symbol.compare(player2Symbol);

            // Wyświetl wynik rundy i aktualny stan punktów
            System.out.println("Gracz 1 wybrał: " + player1Symbol);
            System.out.println("Gracz 2 wybrał: " + player2Symbol);
            if (result == 1) {
                System.out.println("Gracz 1 wygrywa rundę!");
                player1Points++;
            } else if (result == -1) {
                System.out.println("Gracz 2 wygrywa rundę!");
                player2Points++;
            } else {
                System.out.println("Remis!");
            }
            System.out.println("Punkty gracza 1: " + player1Points);
            System.out.println("Punkty gracza 2: " + player2Points);
            System.out.println();
        }

        // Wyświetl komunikat o zwycięstwie lub porażce na końcu gry
        if (player1Points == WIN_POINTS) {
            System.out.println("Gratulacje! Wygrałeś grę!");
        } else {
            System.out.println("Niestety, przegrałeś grę.");
        }
    }

    // Metoda pomocnicza do generowania losowego symbolu
    public static Symbol randomSymbol() {
        // Użyj metody ordinal() na enumie, aby uzyskać liczbę odpowiadającą kolejności symbolu
        // Użyj metody values() na enumie, aby uzyskać tablicę wszystkich symboli
        return Symbol.values()[secureRandom.nextInt(Symbol.values().length)];
    }
}
