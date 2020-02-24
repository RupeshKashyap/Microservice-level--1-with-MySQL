package com.example.ratingdataservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rating {
    @Id
    private Integer movieId;
    private int rating;

    public Rating(Integer movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }
    public Rating(){}

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
