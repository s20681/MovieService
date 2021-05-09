package com.s20681.MovieService.Controller;

import com.s20681.MovieService.Model.Movie;
import com.s20681.MovieService.Service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@RestController
@RequestMapping("/movies")
public class MovieController {
    MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping()
    ResponseEntity<ArrayList<Movie>> allMovies(){
        return ResponseEntity.ok(movieService.getMovies());
    }

    @GetMapping("/{id}")
    ResponseEntity<Movie> movieById(@PathVariable String id){
        Movie movie = movieService.getMovie(id);
        if(movie.getId() != null){
            return ResponseEntity.ok(movie);
        }
        return new ResponseEntity<Movie>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/add")
    ResponseEntity<String> addMovies(){
        Movie movie1 = new Movie("Hobbit", "Horror");
        Movie movie2 = new Movie("Wladca Pierscieni", "Familijne");
        Movie movie3 = new Movie("Harry Potter", "Kryminał");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
        movieService.addmovie(movie1);
        movieService.addmovie(movie2);
        movieService.addmovie(movie3);
        return ResponseEntity.ok("Movies succesfully added.");
    }

    @GetMapping("/exception")
    void throwException2() throws RuntimeException{
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "tresc_naszego_błędu");
    }



}
