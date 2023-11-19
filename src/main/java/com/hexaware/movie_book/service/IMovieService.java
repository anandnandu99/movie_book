package com.hexaware.movie_book.service;

import java.util.List;

import com.hexaware.movie_book.dto.MovieDTO;
import com.hexaware.movie_book.entities.Movie;
import com.hexaware.movie_book.exception.MovieNotFoundException;

public interface IMovieService {
	
	    Movie addMovie(MovieDTO movieDTO) ;
	    
	    MovieDTO getByMovieId(int movieId)throws MovieNotFoundException;

	    List<Movie> getAllMovies();

	    MovieDTO getByMovieName(String movieName);
	    Movie updateByMovieId(int movieId, MovieDTO movieDTO);

	    void deleteByMovieId(int movieId);
	    void deleteByMovieName(String movieName);

	    

	    
    
}
