package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        String nazwaWykonawcy = "Deep Purple";
        String tytulPlyty = "Purple in Rock";
        int rokWydania = 1979;
        String[] nazwyUtworow = {"Song 1", "Song 2", "Song 3"};
        int[] czasTrwaniaUtworow = {180, 210, 195};
        String gatunekMuzyczny = "Rock";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://", "uzytkownik", "haslo")) {
            System.out.println("Połączono z bazą danych!");
            // Zapytanie SQL do dodania wykonawcy
            String query = "INSERT INTO wykonawcy (nazwa, tytul_plyty, rok_wydania, gatunek) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            // Ustawienie parametrów zapytania
            statement.setString(1, nazwaWykonawcy);
            statement.setString(2, tytulPlyty);
            statement.setInt(3, rokWydania);
            statement.setString(4, gatunekMuzyczny);

            // Wykonanie zapytania
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Wykonawca dodany do bazy danych!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
