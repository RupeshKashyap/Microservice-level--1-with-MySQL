package com.example.moviesinfoservice.models;

public class MovieSummary {

    private Integer id;
    private String title;
    private String overview;

    public MovieSummary(Integer id, String title, String overview) {
        this.id=id;
        this.title=title;
        this.overview=overview;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}

