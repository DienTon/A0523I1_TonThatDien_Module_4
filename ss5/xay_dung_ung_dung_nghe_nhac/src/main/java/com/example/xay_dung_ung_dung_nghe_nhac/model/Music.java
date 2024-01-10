package com.example.xay_dung_ung_dung_nghe_nhac.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music {
    @Id
    private int id;
    private String name,artist,category,link;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Music() {
    }

    public Music(String name, String artist, String category, String link) {
        this.name = name;
        this.artist = artist;
        this.category = category;
        this.link = link;
    }
}
