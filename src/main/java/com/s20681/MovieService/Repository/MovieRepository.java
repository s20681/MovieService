package com.s20681.MovieService.Repository;

import com.s20681.MovieService.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
