package com.hafidzproject.basicandroid.data;

public class Anime {

    private String judul;
    private double rating;

    public Anime(String judul, double rating) {
        this.judul = judul;
        this.rating = rating;
    }

    public String getJudul() {
        return judul;
    }

    public double getRating() {
        return rating;
    }
}
