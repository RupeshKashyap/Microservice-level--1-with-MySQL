package com.example.moviescatalogservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
 public class CatalogItem {
    @Id
    private Integer catalogid;
    private String name;
    private String m_desc;
    private int rating;

    public CatalogItem(){}

    public CatalogItem(String name, String m_desc, int rating, Integer catalogid) {
        this.name = name;
        this.m_desc = m_desc;
        this.rating = rating;
        this.catalogid = catalogid;
    }
    public Integer getCatalogid(){

        return  catalogid;
    }
    public void setCatalogid(Integer catalogid){

          this.catalogid=catalogid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return m_desc;
    }

    public void setDesc(String m_desc) {
        this.m_desc = m_desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
