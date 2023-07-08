package org.example.ZadanieSDA;

import java.util.Objects;

public class Human {
    public static void main(String[] args) {
        Human human1 = new Human("Jan", "Kowalski", "123456789");
        Human human2 = new Human("Jan", "Kowalski","321654987");
        System.out.println(human1.equals(human2));
    }
    private String firstName;
    private String lastName;
    private String pesel;

    public Human(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName)
        && Objects.equals(pesel, human.pesel);

    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel);
    }
}

