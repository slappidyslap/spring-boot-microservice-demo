package io.melakuera.movieinfoservice.controller;

import io.melakuera.movieinfoservice.entity.MovieInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieInfo")
public class MovieInfoController {

    @GetMapping("/{movieId}")
    MovieInfo getMovieInfoByMovieId(@PathVariable String movieId) {
        return new MovieInfo(movieId, "SUPER");
    }
}
