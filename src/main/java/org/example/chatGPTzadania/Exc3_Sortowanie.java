package org.example.chatGPTzadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exc3_Sortowanie {
    public static void main(String[] args) {
        List<TouristList> tripTourists = new ArrayList<>();
        tripTourists.add(new TouristList(1, "Jan", "Kowalski", 33));
        tripTourists.add(new TouristList(2, "Anna", "Nowak", 28));
        tripTourists.add(new TouristList(3, "Michel", "Zombi", 44));
        tripTourists.add(new TouristList(4, "Julia", "Balerina", 15));

        tourAge(tripTourists);
        for (TouristList age : tripTourists) {
            System.out.println(age.getFirstName() + " " + age.getSecondName() + " -> " + age.getAge());
        }
        tourFirstName(tripTourists);
        for (TouristList firstName: tripTourists ) {
            System.out.println(firstName.getFirstName() + " " + firstName.getSecondName() + " -> " + firstName.getAge());
        }
        tourName(tripTourists);
        for (TouristList name : tripTourists) {
            System.out.println(name.getFirstName() + " " + name.getSecondName() + " " + name.getAge());
        }
    }

    static class TouristList {
        private int ID;
        private String FirstName;
        private String secondName;
        private int age;

        public TouristList(int ID, String firstName, String secondName, int age) {
            this.ID = ID;
            FirstName = firstName;
            this.secondName = secondName;
            this.age = age;
        }

        public int getID() {
            return ID;
        }

        public String getFirstName() {
            return FirstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public int getAge() {
            return age;
        }
    }
    public static void tourAge(List<TouristList> list) {
        list.sort(Comparator.comparing(TouristList::getAge));
    }
    public static void tourFirstName(List<TouristList> list){
        list.sort(Comparator.comparing(TouristList::getFirstName));
    }
    public static void tourName(List<TouristList> list){
        list.sort(Comparator.comparing(TouristList::getSecondName));
    }
}
