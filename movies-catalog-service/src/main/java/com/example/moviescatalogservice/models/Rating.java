package com.example.moviescatalogservice.models;

public class Rating {

    private Integer movieId;
    private int rating;

    public Rating() {

    }

    public Rating(Integer movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
