package io.melakuera.moviecatalogservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieInfo {

    private String movieId;
    private String description;

    public MovieInfo(String movieId, String description) {
        this.movieId = movieId;
        this.description = description;
    }
}
