package com.s20681.MovieService.Service;

import com.s20681.MovieService.Model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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

    public Movie getMovie(String id){
        Optional optional;
        optional = movies.stream().filter(movie -> movie.getId().equals(Long.valueOf(id))).findFirst();

        if(optional.isPresent()){
            return (Movie) optional.get();
        }else {
            return new Movie();
        }

    }
}
