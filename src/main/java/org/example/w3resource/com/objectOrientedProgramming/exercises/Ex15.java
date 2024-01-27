package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;

public class Ex15 {
    //    Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods
//    to add and remove songs, and to play a random song.
    public static void main(String[] args) {
        ArrayList<Song>songArrayList = new ArrayList<>();
        MusicLibrary musicLibrary = new MusicLibrary(songArrayList);
        Song song1 = new Song("Time","Waters",14.55);
        Song song2 = new Song("Summer","Sun",06.23);
        Song song3 = new Song("Winter","Lucius",4.20);
        Song song4 = new Song("Autumn","Scan",1.0);
        Song song5 = new Song("Spring","Bird",2.00);
        Song song6 = new Song("You","Young",10.11);
        Song song7 = new Song("Me","Old",3.21);
        musicLibrary.addSong(song1);
        musicLibrary.addSong(song2);
        musicLibrary.addSong(song3);
        musicLibrary.addSong(song4);
        musicLibrary.addSong(song5);
        musicLibrary.addSong(song6);
        musicLibrary.addSong(song7);
        songArrayList.add(song1);
        songArrayList.add(song2);
        songArrayList.add(song3);
        songArrayList.add(song4);
        songArrayList.add(song5);
        songArrayList.add(song6);
        songArrayList.add(song7);
        musicLibrary.playRandomSong(songArrayList);
        System.out.println(musicLibrary);
    }
}
@Getter
@Setter
class MusicLibrary{
    Random random = new Random();
    private ArrayList<Song> songs;
    public void addSong(Song song){
        songs.add(song);
    }

    public MusicLibrary(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public void removeSong(Song song){
        songs.remove(song);
    }
    public void playRandomSong(ArrayList<Song> songs){
        int nexted = random.nextInt(songs.size());
        System.out.println("Now we're playing a song no "+ nexted);
    }

    @Override
    public String toString() {
        return "\nMusicLibrary{" +
                "random=" + random +
                ", songs=" + songs +
                '}';
    }
}
@Setter
@Getter
@AllArgsConstructor
class Song{
    private String title;
    private String singer;
    private double time;

    @Override
    public String toString() {
        return "\nSong{" +
                "title='" + title + '\'' +
                ", singer='" + singer + '\'' +
                ", time=" + time +
                '}';
    }
}