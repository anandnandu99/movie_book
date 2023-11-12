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

        return repo.save(movie);
    }

    @Override
    public MovieDTO getById(int pid) {
        Movie movie = repo.findById(pid).orElse(null);

        MovieDTO movieDTO = new MovieDTO();

        movieDTO.setMovieId(movie.getMovieId());
        movieDTO.setMovieName(movie.getMovieName());
        movieDTO.setRating(movie.getRating());

        return movieDTO;
    }

    @Override
    public List<Movie> getAllMovies() {
        return repo.findAll();
    }

    @Override
    public List<MovieDTO> getByName(String movieName) {
      
        return null;
    }

    @Override
    public List<MovieDTO> getByRating(Double rating) {
        
        return null;
    }

    @Override
    public List<MovieDTO> getByDirector(String director) {
        
        return null;
    }

    @Override
    public List<MovieDTO> getByLanguage(String language) {
       
        return null;
    }

}
