package io.melakuera.moviecatalogservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Movie {

    private String movieId;
    private String name;
    private String description;
    private double rating;

    public Movie(String movieId, String name, String description, double rating) {
        this.movieId = movieId;
        this.name = name;
        this.description = description;
        this.rating = rating;
    }
}
