package org.example.w3resource.com.objectOrientedProgramming.exercises;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex17 {
//    Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews,
//    and methods for adding and retrieving reviews.

    public static void main(String[] args) {
        Movie movie1 = new Movie("Titanic","James Cameron",
                new ArrayList < String > (Arrays.asList("Leonardo DiCaprio", "Kate Winslet")));
        Movie movie2 = new Movie("The Godfather", "Francis Ford Coppola",
                new ArrayList < String > (Arrays.asList("Marlon Brando", "Al Pacino", "James Can")));
        Review review1 = new Review("Great movie!", "Irvine Rolf", 4.5);
        Review review2 = new Review("Highly recommended!", "Ashkii Karlheinz", 4.5);
        Review review3 = new Review("A classic that never gets old.", "Nele Athol", 4.0);
        Review review4 = new Review("Great movie!", "Cipactli Anselma", 4.0);
        Review review5 = new Review("Highly recommended!", "Martin Nadine", 4.0);

        movie1.addReview(review1);
        movie2.addReview(review2);
        movie1.addReview(review3);
        movie1.addReview(review4);
        movie1.addReview(review5);

        System.out.println("Reviews for '" + movie1.getTitle()+ "':");
        for (Review review : movie1.getReviews()) {
            System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
        }
        System.out.println(movie1.getTitle() + ", " + movie1.getReviews() + ", " + movie1.getDirector() + ", " + movie1.getActors());
        System.out.println(movie2.getTitle() + ", " + movie2.getReviews() + ", " + movie2.getDirector() + ", " + movie2.getActors());
    }
}
@Getter
@Setter
class Movie{
    private String title;
    private String director;
    private ArrayList<String>actors;
    private ArrayList<Review> reviews;

    public Movie(String title, String director, ArrayList<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<Review>();
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }
    public void addReview(Review review){
        reviews.add(review);
    }
    public void retrievingReview(Review review){
        reviews.remove(review);
    }
}
@Getter
@Setter
class Review {
    private final String reviewText;
    private final String reviewerName;
    private final double rating;

    public Review(String reviewText, String reviewerName, double rating) {
        this.reviewText = reviewText;
        this.reviewerName = reviewerName;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewText='" + reviewText + '\'' +
                ", reviewerName='" + reviewerName + '\'' +
                ", rating=" + rating +
                '}';
    }
}

