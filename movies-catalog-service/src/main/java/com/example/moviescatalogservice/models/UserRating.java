package com.example.moviescatalogservice.models;

import java.util.List;

public class UserRating {
    private Integer userId;
    private List<Rating> ratings;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

}

