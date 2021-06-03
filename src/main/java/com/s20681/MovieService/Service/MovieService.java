package com.s20681.MovieService.Service;


import com.s20681.MovieService.Exception.MovieNotFoundException;
import com.s20681.MovieService.Model.Movie;
import com.s20681.MovieService.Repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService{
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public Movie getMovie(String id) throws MovieNotFoundException {
        Long idLong = Long.parseLong(id);
        return movieRepository.findById(idLong).orElseThrow(MovieNotFoundException::new);
    }

    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }

    public void addMovie(Movie movie){
        movieRepository.save(movie);
    }

    public void addMovies(List<Movie> movieArrayList){
        movieRepository.saveAll(movieArrayList);
    }

    public void deleteMovie(String id) throws MovieNotFoundException {
        movieRepository.delete(getMovie(id));
    }

    public void updateMovie(Movie movie){
        if(movieRepository.existsById(movie.getId())){
            movieRepository.save(movie);
        }
    }

    public void updateMovieAvailability(String id) throws MovieNotFoundException {
        Long idLong = Long.parseLong(id);
        if(movieRepository.existsById(idLong)){
            getMovie(id).setAvailable(true);
            movieRepository.save(getMovie(id));
        }
    }

}
