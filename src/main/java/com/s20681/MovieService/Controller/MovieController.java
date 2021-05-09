package com.s20681.MovieService.Controller;

import com.s20681.MovieService.Model.Movie;
import com.s20681.MovieService.Service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@RestController
@RequestMapping("/movies/")
public class MovieController {
    MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping()
    ResponseEntity<ArrayList<Movie>> allMovies(){
        return ResponseEntity.ok(movieService.getMovies());
    }


    @GetMapping("/add")
    void addMovies(){
        Movie movie1 = new Movie("HP", "Horror");
        Movie movie2 = new Movie("HP", "Horror");
        Movie movie3 = new Movie("HP", "Horror");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
        movieService.addmovie(movie1);
        movieService.addmovie(movie2);
        movieService.addmovie(movie3);
    }

    @GetMapping("/exception")
    void throwException2() throws RuntimeException{
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "tresc_naszego_błędu");
    }



}
