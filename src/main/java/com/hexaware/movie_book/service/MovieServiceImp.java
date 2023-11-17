package com.hexaware.movie_book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.movie_book.dto.MovieDTO;
import com.hexaware.movie_book.entities.Movie;
import com.hexaware.movie_book.repository.MovieRepository;

@Service
public class MovieServiceImp implements IMovieService {

    @Autowired
    MovieRepository repo;

    @Override
    public Movie addMovie(MovieDTO movieDTO) {
    	
    	

    	Movie movie = new Movie();
        movie.setMovieId(movieDTO.getMovieId());
        movie.setMovieName(movieDTO.getMovieName());
        movie.setRating(movieDTO.getRating());
        movie.setDirector(movieDTO.getDirector()); 
        movie.setReleaseYear(movieDTO.getReleaseYear());
        movie.setLanguage(movieDTO.getLanguage());
        movie.setDescription(movieDTO.getDescription());
        return repo.save(movie);
        
    	}


    		
    

    @Override
    public MovieDTO getByMovieId(int movieId) {
        Movie movie = repo.findById(movieId).orElse(null);

        MovieDTO movieDTO = new MovieDTO();

        if (movie != null) {
            movieDTO.setMovieId(movie.getMovieId());
            movieDTO.setMovieName(movie.getMovieName());
            movieDTO.setRating(movie.getRating());
            movieDTO.setDirector(movie.getDirector()); 
            movieDTO.setReleaseYear(movie.getReleaseYear());
            movieDTO.setLanguage(movie.getLanguage());
            movieDTO.setDescription(movie.getDescription());

        }

        return movieDTO;
    }

    @Override
    public List<Movie> getAllMovies() {
        return repo.findAll();
    }

    @Override
    public MovieDTO getByMovieName(String movieName) {
    	 Movie movie = repo.findByMovieName(movieName);

    	    MovieDTO movieDTO = new MovieDTO();

    	    if (movie != null) {
    	        movieDTO.setMovieId(movie.getMovieId());
    	        movieDTO.setMovieName(movie.getMovieName());
    	        movieDTO.setRating(movie.getRating());
    	        movieDTO.setDirector(movie.getDirector());
    	        movieDTO.setReleaseYear(movie.getReleaseYear());
    	        movieDTO.setLanguage(movie.getLanguage());
                movieDTO.setDescription(movie.getDescription());

    	    }

    	    return  movieDTO;
        }

    @Override
    public void deleteByMovieId(int movieId) {
        // Check if the movie exists
        Movie movie = repo.findById(movieId).orElse(null);

       
            repo.delete(movie);
            
        }

	@Override
	public void deleteByMovieName(String movieName) {
		Movie movie = repo.findByMovieName(movieName);

	       
        repo.delete(movie);
		
	} 
	
	@Override
    public Movie updateByMovieId(int movieId, MovieDTO movieDTO) {
        Movie movie = repo.findById(movieId).orElse(null);

        if (movie != null) {
	            movie.setMovieName(movieDTO.getMovieName());
	            movie.setRating(movieDTO.getRating());
	            movie.setDirector(movieDTO.getDirector());
	            movie.setReleaseYear(movieDTO.getReleaseYear());
	            movie.setLanguage(movieDTO.getLanguage());
	            movie.setDescription(movieDTO.getDescription());

	            // Save the updated movie to the database
	            return repo.save(movie);
        }
        else {
        	return null;
        }
	}

	
	
}
            
	