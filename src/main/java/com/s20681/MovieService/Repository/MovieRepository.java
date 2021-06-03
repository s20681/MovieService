package com.s20681.MovieService.Repository;

import com.s20681.MovieService.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Override
    Optional<Movie> findById(Long aLong);

    @Override
    List<Movie> findAll();

    @Override
    <S extends Movie> S save(S s);

    @Override
    <S extends Movie> List<S> saveAll(Iterable<S> iterable);

    @Override
    void delete(Movie movie);


}
