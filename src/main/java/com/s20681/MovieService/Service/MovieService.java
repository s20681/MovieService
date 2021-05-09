package com.s20681.MovieService.Service;

import com.s20681.MovieService.Model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MovieService{
    ArrayList<Movie> movies;

    public MovieService(){
        this.movies = new ArrayList<>();
    }

    public void addmovie(Movie movie){
        movies.add(movie);
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}
