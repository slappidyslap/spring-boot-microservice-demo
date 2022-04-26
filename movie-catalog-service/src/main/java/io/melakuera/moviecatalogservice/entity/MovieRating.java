package io.melakuera.moviecatalogservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieRating {

    private String movieId;
    private double rating;

    public MovieRating(String movieId, double rating) {
        this.movieId = movieId;
        this.rating = rating;
    }
}
