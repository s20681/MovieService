package com.s20681.MovieService.Controller;

import com.s20681.MovieService.Exception.MovieNotFoundException;
import com.s20681.MovieService.Model.Movie;
import com.s20681.MovieService.Service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping()
    ResponseEntity<List<Movie>> allMovies() {
        return ResponseEntity.ok((List<Movie>) movieService.getMovies());
    }

    @GetMapping("/{id}")
    ResponseEntity<Movie> movieById(@PathVariable String id) throws MovieNotFoundException {
        return ResponseEntity.ok(movieService.getMovie(id));
    }

    @GetMapping("/addmany")
    ResponseEntity<HttpStatus> addMovies(ArrayList<Movie> movieArrayList) {
        movieService.addMovies(movieArrayList);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping("/add")
    ResponseEntity<HttpStatus> addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping("/remove/{id}")
    void removeMovie(@PathVariable String id) throws MovieNotFoundException{
        movieService.deleteMovie(id);
    }

    @PostMapping("/add")
    void updateMovie(@RequestBody Movie movie){
        movieService.updateMovie(movie);
    }

    @GetMapping("/exception")
    void throwException2() throws RuntimeException {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "tresc_naszego_błędu");
    }
}
