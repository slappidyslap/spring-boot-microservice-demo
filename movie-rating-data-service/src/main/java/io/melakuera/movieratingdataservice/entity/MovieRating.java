package io.melakuera.movieratingdataservice.entity;

import lombok.Data;

@Data
public class MovieRating {

    private String movieId;
    private double rating;

    public MovieRating(String movieId, double rating) {
        this.movieId = movieId;
        this.rating = rating;
    }
}
