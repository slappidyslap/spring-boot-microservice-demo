package io.melakuera.movieinfoservice.entity;

import lombok.Data;

@Data
public class MovieInfo {

    private String movieId;
    private String description;

    public MovieInfo(String movieId, String description) {
        this.movieId = movieId;
        this.description = description;
    }
}
