package io.melakuera.movieratingdataservice.controller;

import io.melakuera.movieratingdataservice.entity.MovieRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieRatingData")
public class MovieRatingController {

    @GetMapping("/{movieId}")
    MovieRating getRating(@PathVariable String movieId) {
        return new MovieRating(movieId, 4.9);
    }
}
