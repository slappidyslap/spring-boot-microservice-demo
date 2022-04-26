package io.melakuera.moviecatalogservice.controller;

import io.melakuera.moviecatalogservice.entity.Movie;
import io.melakuera.moviecatalogservice.entity.MovieInfo;
import io.melakuera.moviecatalogservice.entity.MovieRating;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movieCatalog")
public class MovieController {

    private final RestTemplate restTemplate;

    // private WebClient.Builder webClientBuilder = WebClient.builder();

    @GetMapping("/{movieId}")
    List<Movie> getMovies(@PathVariable String movieId) {

        MovieInfo movieInfo = restTemplate.getForObject(
                "http://localhost:8081/movieInfo/"+movieId, MovieInfo.class);

        MovieRating movieRating = restTemplate.getForObject(
                "http://localhost:8083/movieRatingData/"+movieId, MovieRating.class);

//        MovieInfo movieInfo = webClientBuilder.build()
//                .get()
//                .uri("http://localhost:8081/movieInfo/"+movieId)
//                .retrieve()
//                .bodyToMono(MovieInfo.class)
//                .block();
//        MovieRating movieRating = webClientBuilder.build()
//                .get()
//                .uri( "http://localhost:8083/movieRatingData/"+movieId)
//                .retrieve()
//                .bodyToMono(MovieRating.class)
//                .block();

        assert movieRating != null;
        assert movieInfo != null;
        Movie movie = new Movie(
                movieId, "Matrix", movieInfo.getDescription(), movieRating.getRating());

        return Collections.singletonList(movie);
    }
}
