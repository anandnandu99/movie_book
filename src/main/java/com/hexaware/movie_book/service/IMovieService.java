package com.hexaware.movie_book.service;

import java.util.List;

import com.hexaware.movie_book.dto.MovieDTO;
import com.hexaware.movie_book.entities.Movie;

public interface IMovieService {
	
	    Movie addMovie(MovieDTO movieDTO) ;
	    
	    MovieDTO getByMovieId(int movieId);

	    List<Movie> getAllMovies();

	    MovieDTO getByMovieName(String movieName);
	    Movie updateByMovieId(int movieId, MovieDTO movieDTO);

	    void deleteByMovieId(int movieId);
	    void deleteByMovieName(String movieName);

	    

	    
    
}
