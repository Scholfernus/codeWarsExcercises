package org.example.w3resource.com.objectOrientedProgramming;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<Review> reviews;

    public Movie(String title, String director, ArrayList<String> actors, ArrayList<Review> reviews) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = reviews;
    }
}
class Review{
    private String reviewText;
    private  String reviewerName;
    private double rating;

    public Review(String reviewText, String reviewerName, double rating) {
        this.reviewText = reviewText;
        this.reviewerName = reviewerName;
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public double getRating() {
        return rating;
    }
}