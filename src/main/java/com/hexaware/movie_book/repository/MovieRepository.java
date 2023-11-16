package com.hexaware.movie_book.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.movie_book.entities.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

	Movie findByMovieName(String movieName);

	List<Movie> findByRating(Double rating);


	

	

	

}


